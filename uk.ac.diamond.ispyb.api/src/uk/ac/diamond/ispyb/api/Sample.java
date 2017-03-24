package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Sample {
    Long sampleId;
    String sampleName;
    String sampleCode;
    String sampleComments;
    String sampleLocation;
    String samplePackingFraction;
    Double dimension1;
    Double dimension2;
    Double dimension3;
    String shape;
    Long sampleTypeId;
    String sampleTypeName;
    String sampleTypeComments;
    String sampleTypeSpaceGroup;

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
    };
}
