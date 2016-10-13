package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

public interface IspybFactoryService {
	IspybApi build(String url, Optional<String> username, Optional<String> password, Optional<Schema> schema) throws SQLException;

	IspybApi build(String url, Properties properties, Optional<Schema> schema) throws SQLException;
}