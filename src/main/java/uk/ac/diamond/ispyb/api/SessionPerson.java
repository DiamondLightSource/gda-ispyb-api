package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SessionPerson {
    private String title;
    private String givenName;
    private String familyName;
    private String login;
    private String role;
    private Integer remote;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRemote() {
        return remote;
    }

    public void setRemote(Integer remote) {
        this.remote = remote;
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this, that);
    }
}
