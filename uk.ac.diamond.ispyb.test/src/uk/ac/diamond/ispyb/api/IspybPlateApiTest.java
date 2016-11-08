package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.h2.tools.SimpleResultSet;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybDaoFactory;

public class IspybPlateApiTest {

	@Test
	public void testShouldCreateApi() throws SQLException {
		String url = new H2UrlBuilder().build();
		IspybFactoryService service = new IspybDaoFactory();
		IspybPlateApi api = service.buildIspybPlateApi(url, Optional.empty(), Optional.empty(), Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.closeConnection();
	}
	
	@Test
	public void testShouldRetrieveContainerLsPosition() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_container_ls_position", "reverse").build();
		IspybPlateApi api = new IspybDaoFactory().buildIspybPlateApi(url, Optional.empty(), Optional.empty(),Optional.of(Schema.ISPYB.toString()));

		int pos = api.retrieveContainerLSPosition("12345");
		assertThat(pos, is(equalTo(54321)));

		api.closeConnection();
	}

	@Test
	public void testShouldRetrieveBean() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_container_info", "containerInfo").build();
		IspybPlateApi api = new IspybDaoFactory().buildIspybPlateApi(url, Optional.empty(), Optional.empty(),Optional.of(Schema.ISPYB.toString()));

		ContainerInfo bean = api.retrieveContainerInfo("12345");
		ContainerInfo expectedBean = new ContainerInfo();
		expectedBean.setName("name");
		expectedBean.setType("type");
		expectedBean.setBarcode("barcode");
		expectedBean.setBeamline("beamline");
		expectedBean.setLocation("location");
		expectedBean.setImagerName("imagerName");
		expectedBean.setImagerSerialNumber("imagerSerialNumber");
		expectedBean.setStatus(ContainerStatus.LOCAL_STORAGE.getStatus());
		expectedBean.setCapacity(5);
		expectedBean.setStorageTemperature(0.5f);
		
		assertThat(bean, is(equalTo(expectedBean)));

		api.closeConnection();
	}

	public static final Long reverse(String s) { 
		return Long.valueOf(new StringBuilder(s).reverse().toString());
	}

	public static final ResultSet containerInfo(String s) { 
		SimpleResultSet result = new SimpleResultSet();
		List<String> fields = Arrays.asList("name", "type", "barcode", "beamline", "location", "imagerName", "imagerSerialNumber", "status"); 
		fields.forEach(field -> result.addColumn(field, Types.VARCHAR, 255, 0));
		result.addColumn("capacity", Types.INTEGER, 10, 0);
		result.addColumn("storageTemperature", Types.FLOAT, 10, 0);
		result.addRow("name", "type", "barcode", "beamline", "location", "imagerName", "imagerSerialNumber", ContainerStatus.LOCAL_STORAGE.getStatus(), 5, 0.5);
		return result;
	}
}
