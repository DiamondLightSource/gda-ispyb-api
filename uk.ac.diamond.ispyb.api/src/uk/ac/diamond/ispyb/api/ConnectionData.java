package uk.ac.diamond.ispyb.api;

import java.util.Optional;

public class ConnectionData {

	private String host = System.getProperty("ispyb.host");
	private  String url = System.getProperty("ispyb.url");
	private  Optional<String> user = Optional.ofNullable(System.getProperty("ispyb.user"));
	private  Optional<String> password = Optional.ofNullable(System.getProperty("ispyb.pw"));
	private  Optional<String> port = Optional.ofNullable(System.getProperty("ispyb.port"));
	private  String systemUser = System.getProperty("user.name");
	private  String schema = "maven_" + systemUser;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Optional<String> getUser() {
		return user;
	}
	public void setUser(Optional<String> user) {
		this.user = user;
	}
	public Optional<String> getPassword() {
		return password;
	}
	public void setPassword(Optional<String> password) {
		this.password = password;
	}
	public Optional<String> getPort() {
		return port;
	}
	public void setPort(Optional<String> port) {
		this.port = port;
	}
	public String getSystemUser() {
		return systemUser;
	}
	public void setSystemUser(String systemUser) {
		this.systemUser = systemUser;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
		result = prime * result + ((schema == null) ? 0 : schema.hashCode());
		result = prime * result + ((systemUser == null) ? 0 : systemUser.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConnectionData other = (ConnectionData) obj;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		if (schema == null) {
			if (other.schema != null)
				return false;
		} else if (!schema.equals(other.schema))
			return false;
		if (systemUser == null) {
			if (other.systemUser != null)
				return false;
		} else if (!systemUser.equals(other.systemUser))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	
}
