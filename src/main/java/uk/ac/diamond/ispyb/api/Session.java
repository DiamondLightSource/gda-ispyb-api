package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

public class Session {
    private String session;
    private Timestamp startDate;
    private Timestamp endDate;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
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
