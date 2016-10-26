package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

public interface IspybFactoryService {
	IspybPlateApi buildIspybPlateApi(String url, Optional<String> username, Optional<String> password, Optional<Schema> schema) throws SQLException;
	IspybPdfApi buildIspybPdfApi(String url, Optional<String> username, Optional<String> password, Optional<Schema> schema) throws SQLException;

	IspybPlateApi buildIspybPlateApi(String url, Properties properties, Optional<Schema> schema) throws SQLException;
	IspybPdfApi buildIspybPdfApi(String url, Properties properties, Optional<Schema> schema) throws SQLException;
}