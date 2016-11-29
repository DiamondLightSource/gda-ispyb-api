
package uk.ac.diamond.ispyb.api;

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionMachine {

    private int id;
    private String synchrotronMode;
    private float undulatorGap1;
    private float undulatorGap2;
    private float undulatorGap3;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSynchrotronMode() {
        return this.synchrotronMode;
    }

    public void setSynchrotronMode(String synchrotronMode) {
        this.synchrotronMode = synchrotronMode;
    }

    public float getUndulatorGap1() {
        return this.undulatorGap1;
    }

    public void setUndulatorGap1(float undulatorGap1) {
        this.undulatorGap1 = undulatorGap1;
    }

    public float getUndulatorGap2() {
        return this.undulatorGap2;
    }

    public void setUndulatorGap2(float undulatorGap2) {
        this.undulatorGap2 = undulatorGap2;
    }

    public float getUndulatorGap3() {
        return this.undulatorGap3;
    }

    public void setUndulatorGap3(float undulatorGap3) {
        this.undulatorGap3 = undulatorGap3;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

}
