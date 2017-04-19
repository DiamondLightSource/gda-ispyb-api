package uk.ac.diamond.ispyb.scanning.test;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

import org.eclipse.dawnsci.analysis.api.persistence.IMarshallerService;
import org.eclipse.dawnsci.json.MarshallerService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.diamond.ispyb.scanning.MarshallingRegistry;

public class BeanSerializationTest {
	
	private static final Logger logger = LoggerFactory.getLogger(BeanSerializationTest.class);
	private IMarshallerService marshaller;
	
	@Before
	public void create() {
		marshaller = new MarshallerService(new MarshallingRegistry());
	}

	@Test
	public void typeCheck() throws Exception {
		
		for (Class<?> clazz : MarshallingRegistry.beanClasses) {
			
			if (clazz.isEnum()) continue;
			Object bean = clazz.newInstance();
			createEmptyObjectsForSomeFields(bean, clazz);
			String json = marshaller.marshal(bean);
			Object neab = marshaller.unmarshal(json, clazz);
			assertEquals(bean, neab);
		}
	}

	/**
	 * Used just to ensure that some fields are non-null.
	 * @param bean
	 * @param clazz
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private void createEmptyObjectsForSomeFields(Object bean, Class<?> clazz) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			String setterName = getSetterName(field.getName());
			String getterName = getGetterName(field.getName());
			try {
				Class<?> type = clazz.getMethod(getterName).getReturnType();
				if (type.isEnum()) continue;
				Object value  = type.newInstance();
				Method method = clazz.getMethod(setterName, value.getClass()); 
				method.invoke(bean, value);
			} catch (InstantiationException | InvocationTargetException ne) {
				continue;
			} catch (NoSuchMethodException ne) {
				logger.error("Cannot final the method {} in {}", setterName, clazz.getSimpleName());
				throw ne;
			}
		}
	}
	
	private static String getGetterName(final String fieldName) {
		if (fieldName == null) return null;
		return getName("get", fieldName);
	}
	private static String getSetterName(final String fieldName) {
		if (fieldName == null) return null;
		return getName("set", fieldName);
	}
	private static String getName(final String prefix, final String fieldName) {
		return prefix + getFieldWithUpperCaseFirstLetter(fieldName);
	}
	public static String getFieldWithUpperCaseFirstLetter(final String fieldName) {
		return fieldName.substring(0, 1).toUpperCase(Locale.US) + fieldName.substring(1);
	}

}
