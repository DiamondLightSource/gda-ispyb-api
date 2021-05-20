package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Aperture {
    private long apertureId;
    private double sizeX;

    public long getApertureId() {
        return apertureId;
    }

    public void setApertureId(long apertureId) {
        this.apertureId = apertureId;
    }

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
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
