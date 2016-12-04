package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybPdfDaoFactory;

public class IspybPdfApiTest {
	private final IspybPdfFactoryService factory = new IspybPdfDaoFactory();

	@Test
	public void testShouldCreateApi() throws SQLException, IOException {
		String url = new H2UrlBuilder().build();
		IspybPdfApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.close();
	}

}
