package uk.ac.diamond.ispyb.api;

import java.util.Optional;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

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
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }
	
}
