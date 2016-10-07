package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybDaoFactory;

public class IspybApiTest {
	private static final String REVERSE = "$$ String reverse(String s) { return new StringBuilder(s).reverse().toString()\\; } $$";
	
	@Test
	public void shouldCreateApi() throws SQLException {
		IspybFactoryService service = new IspybDaoFactory();
		IspybApi api = service.build("jdbc:h2:mem:test", Optional.empty(), Optional.empty());

		assertThat(api, is(notNullValue()));
		
		api.closeConnection();
	}

	@Test
	public void shouldRetrieveContainerInfo() throws SQLException {
		String dbInit = "INIT=CREATE SCHEMA ispyb\\; CREATE ALIAS ispyb.retrieve_container_info AS " + REVERSE;
		IspybApi api = new IspybDaoFactory().build("jdbc:h2:mem:test;" + dbInit, Optional.empty(), Optional.empty());

		Map<String, Object> map = api.retrieveContainerInfo("12345");
		assertThat(map.get("ISPYB.RETRIEVE_CONTAINER_INFO(?1)"), is(equalTo("54321")));		
		
		api.closeConnection();
	}
}
