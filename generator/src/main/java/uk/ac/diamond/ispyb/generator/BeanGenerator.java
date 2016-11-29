package uk.ac.diamond.ispyb.generator;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import com.sun.codemodel.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.annotation.Generated;

public class BeanGenerator {
    private static String sourceDir = "/scratch/ispyb-api/uk.ac.diamond.ispyb.api/src";
    private static final String url = System.getProperty("ispyb.url");
    private static final String user = System.getProperty("ispyb.user");
    private static final String password = System.getProperty("ispyb.pw");

    public static void main(String[] args) throws SQLException, IOException, JClassAlreadyExistsException {
        readStructure(url, user, password, sourceDir, "update_dc_machine", "DataCollectionMachine");
    }

    private static void readStructure(String url, String user, String password, String sourceDir, String storeProcedure, String className) throws JClassAlreadyExistsException, SQLException, IOException {
        JCodeModel codeModel = new JCodeModel();
        JPackage javaPackage = codeModel._package("uk.ac.diamond.ispyb.api");
        JDefinedClass definedClass = javaPackage._class(className);
        JAnnotationUse annotation = definedClass.annotate(Generated.class);
        annotation.param("value", BeanGenerator.class.getTypeName());

        try (Connection connection = createConnection(url, user, password)) {
            ResultSet columns = connection.getMetaData().getProcedureColumns(null, null, storeProcedure, null);

            while (columns.next()) {
                String columnName = columns.getString(4);
                String columnReturnTypeName = columns.getString(7);

                createFieldsForColumn(codeModel, definedClass, columnName, columnReturnTypeName);
            }
        }

        addGeneralBeanMethods(codeModel, definedClass);

        codeModel.build(new File(sourceDir));
    }

    private static void addGeneralBeanMethods(JCodeModel codeModel, JDefinedClass definedClass) {
        definedClass.method(JMod.PUBLIC, codeModel.ref(String.class), "toString").body()
                ._return(codeModel.ref(ReflectionToStringBuilder.class).staticInvoke("toString").arg(JExpr._this()));
        definedClass.method(JMod.PUBLIC, codeModel.INT, "hashCode").body()
                ._return(codeModel.ref(HashCodeBuilder.class).staticInvoke("reflectionHashCode").arg(JExpr._this()));
        JMethod equals = definedClass.method(JMod.PUBLIC, codeModel.BOOLEAN, "equals");
        JVar that = equals.param(Object.class, "that");
        equals.body()._return(codeModel.ref(EqualsBuilder.class).staticInvoke("reflectionEquals").arg(JExpr._this()).arg(that));
    }

    private static void createFieldsForColumn(JCodeModel codeModel, JDefinedClass definedClass, String columnName, String columnReturnTypeName) throws SQLException {
        if (columnName != null) {
            String javaColumnName = StringUtils.removeStart(columnName, "p_");

            Map<String, JType> typeMap = generateTypeMap(codeModel);
            JType type = typeMap.get(columnReturnTypeName);
            JPrimitiveType voidType = codeModel.VOID;

            // sometimes the same fields are defined on way in and out of a sql procedure
            if (!definedClass.fields().containsKey(javaColumnName)) {
                createField(definedClass, javaColumnName, type, voidType);
            }
        }
    }

    private static void createField(JDefinedClass definedClass, String columnName, JType type, JPrimitiveType voidType) {
        JFieldVar field = definedClass.field(JMod.PRIVATE, type, columnName);
        String capitalisedColumnName = StringUtils.capitalize(columnName);
        definedClass.method(JMod.PUBLIC, type, "get" + capitalisedColumnName)
                .body()._return(JExpr._this().ref(field));
        JMethod setter = definedClass.method(JMod.PUBLIC, voidType, "set" + capitalisedColumnName);
        setter.param(type, columnName);
        setter.body().assign(JExpr._this().ref(field), JExpr.ref(columnName));
    }

    private static Map<String, JType> generateTypeMap(JCodeModel codeModel) {
        Map<String, JType> typeMap = new HashMap<>();
        typeMap.put("float", codeModel.FLOAT);
        typeMap.put("double", codeModel.DOUBLE);
        typeMap.put("int", codeModel.INT);
        typeMap.put("tinyint", codeModel.INT);
        typeMap.put("varchar", codeModel.ref(String.class));
        typeMap.put("enum", codeModel.ref(String.class));
        typeMap.put("timestamp", codeModel.ref(Timestamp.class));
        typeMap.put("datetime", codeModel.ref(LocalDateTime.class));
        return typeMap;
    }

    private static Connection createConnection(String url, String user, String password) throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password", password);
        props.setProperty("nullCatalogMeansCurrent", "false");

        return DriverManager.getConnection(url, props);
    }
}