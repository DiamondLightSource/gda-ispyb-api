package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Optional;

public class SampleGroup {
  private Long sampleGroupId;
  private Long order;
  private SampleGroupType type;

    public Long getSampleGroupId() {
        return sampleGroupId;
    }

    public void setSampleGroupId(Long blSampleGroupId) {
        this.sampleGroupId = blSampleGroupId;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public String getType() {
        return type.toString().toLowerCase();
    }

    public void setType(String type) {
        Optional.ofNullable(type)
                .ifPresent(t -> this.type = SampleGroupType.valueOf(type.toUpperCase()));
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
    };
}
