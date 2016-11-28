package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.h2.tools.SimpleResultSet;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybPlateDaoFactory;

public class IspybPlateApiTest {
	private final IspybPlateFactoryService factory = new IspybPlateDaoFactory();

	@Test
	public void testShouldCreateApi() throws SQLException, IOException {
		String url = new H2UrlBuilder().build();
		IspybPlateApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.close();
	}

	@Test
	public void testShouldRetrieveContainerLsPosition() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_container_ls_position", "reverse")
				.build();
		IspybPlateApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		int pos = api.retrieveContainerLSPosition("12345");
		assertThat(pos, is(equalTo(54321)));

		api.close();
	}

	@Test
	public void testShouldRetrieveBean() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_container_info", "containerInfo")
				.build();
		IspybPlateApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		ContainerInfo bean = api.retrieveContainerInfo("12345");
		ContainerInfo expectedBean = new ContainerInfo();
		expectedBean.setName("name");
		expectedBean.setType("type");
		expectedBean.setBarcode("barcode");
		expectedBean.setBeamline("beamline");
		expectedBean.setLocation("location");
		expectedBean.setImagerName("imagerName");
		expectedBean.setImagerSerialNumber("imagerSerialNumber");
		expectedBean.setStatus(ContainerStatus.IN_LOCALSTORAGE.getStatus());
		expectedBean.setCapacity(5);
		expectedBean.setStorageTemperature(0.5f);

		assertThat(bean, is(equalTo(expectedBean)));

		api.close();
	}

	@Test
	public void testShouldRetrieveList() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb")
				.withAlias("retrieve_container_on_gonio", "listOfContainerInfo").build();
		IspybPlateApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		List<ContainerInfo> beans = api.retrieveContainerOnGonio("12345");
		ContainerInfo expectedBean = new ContainerInfo();
		expectedBean.setName("name");
		expectedBean.setType("type");
		expectedBean.setBarcode("barcode");
		expectedBean.setBeamline("beamline");
		expectedBean.setLocation("location");
		expectedBean.setImagerName("imagerName");
		expectedBean.setImagerSerialNumber("imagerSerialNumber");
		expectedBean.setStatus(ContainerStatus.IN_LOCALSTORAGE.getStatus());
		expectedBean.setCapacity(5);
		expectedBean.setStorageTemperature(0.5f);

		assertThat(beans, is(equalTo(Collections.nCopies(10, expectedBean))));

		api.close();
	}

	public static final Long reverse(String s) {
		return Long.valueOf(new StringBuilder(s).reverse().toString());
	}

	public static final ResultSet containerInfo(String s) {
		return containerInfos(s, 1);
	}

	public static final ResultSet listOfContainerInfo(String s) {
		return containerInfos(s, 10);
	}

	public static final ResultSet containerInfos(String s, int rowCount) {
		SimpleResultSet result = new SimpleResultSet();
		List<String> fields = Arrays.asList("name", "type", "barcode", "beamline", "location", "imagerName",
				"imagerSerialNumber", "status");
		fields.forEach(field -> result.addColumn(field, Types.VARCHAR, 255, 0));
		result.addColumn("capacity", Types.INTEGER, 10, 0);
		result.addColumn("storageTemperature", Types.FLOAT, 10, 0);
		for (int i = 0; i < rowCount; i++) {
			result.addRow("name", "type", "barcode", "beamline", "location", "imagerName", "imagerSerialNumber",
					ContainerStatus.IN_LOCALSTORAGE.getStatus(), 5, 0.5);
		}
		return result;
	}
}
