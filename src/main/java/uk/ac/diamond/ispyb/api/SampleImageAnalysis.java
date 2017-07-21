/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/

package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class SampleImageAnalysis {

    private Integer id;
    private String containerBarcode;
    private String sampleLocation;
    private String oavSnapshotBefore;
    private String oavSnapshotAfter;
    private Long deltaX;
    private Long deltaY;
    private Float goodnessOfFit;
    private Float scaleFactor;
    private String resultCode;
    private Timestamp matchStartTS;
    private Timestamp matchEndTS;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContainerBarcode() {
        return this.containerBarcode;
    }

    public void setContainerBarcode(String containerBarcode) {
        this.containerBarcode = containerBarcode;
    }

    public String getSampleLocation() {
        return this.sampleLocation;
    }

    public void setSampleLocation(String sampleLocation) {
        this.sampleLocation = sampleLocation;
    }

    public String getOavSnapshotBefore() {
        return this.oavSnapshotBefore;
    }

    public void setOavSnapshotBefore(String oavSnapshotBefore) {
        this.oavSnapshotBefore = oavSnapshotBefore;
    }

    public String getOavSnapshotAfter() {
        return this.oavSnapshotAfter;
    }

    public void setOavSnapshotAfter(String oavSnapshotAfter) {
        this.oavSnapshotAfter = oavSnapshotAfter;
    }

    public Long getDeltaX() {
        return this.deltaX;
    }

    public void setDeltaX(Long deltaX) {
        this.deltaX = deltaX;
    }

    public Long getDeltaY() {
        return this.deltaY;
    }

    public void setDeltaY(Long deltaY) {
        this.deltaY = deltaY;
    }

    public Float getGoodnessOfFit() {
        return this.goodnessOfFit;
    }

    public void setGoodnessOfFit(Float goodnessOfFit) {
        this.goodnessOfFit = goodnessOfFit;
    }

    public Float getScaleFactor() {
        return this.scaleFactor;
    }

    public void setScaleFactor(Float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Timestamp getMatchStartTS() {
        return this.matchStartTS;
    }

    public void setMatchStartTS(Timestamp matchStartTS) {
        this.matchStartTS = matchStartTS;
    }

    public Timestamp getMatchEndTS() {
        return this.matchEndTS;
    }

    public void setMatchEndTS(Timestamp matchEndTS) {
        this.matchEndTS = matchEndTS;
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
