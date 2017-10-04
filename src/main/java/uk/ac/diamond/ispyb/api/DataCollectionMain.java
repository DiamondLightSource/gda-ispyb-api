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

/**
 * the main fields related to a data collection
 */
@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionMain {

    private Long id;
    private Long groupId;
    private Integer detectorId;
    private Long blSubSampleId;
    private Integer dcNumber;
    private Timestamp startTime;
    private Timestamp endTime;
    private String status;
    private Integer noImages;
    private Integer startImgNumber;
    private Integer noPasses;
    private String imgDir;
    private String imgPrefix;
    private String imgSuffix;
    private String fileTemplate;
    private String snapshot1;
    private String snapshot2;
    private String snapshot3;
    private String snapshot4;
    private String comments;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Integer getDetectorId() {
        return this.detectorId;
    }

    public void setDetectorId(Integer detectorId) {
        this.detectorId = detectorId;
    }

    public Long getBlSubSampleId() {
        return blSubSampleId;
    }
    
    public void setBlSubSampleId(Long blSubSampleId) {
        this.blSubSampleId = blSubSampleId;
    }

    public Integer getDcNumber() {
        return this.dcNumber;
    }

    public void setDcNumber(Integer dcNumber) {
        this.dcNumber = dcNumber;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNoImages() {
        return this.noImages;
    }

    public void setNoImages(Integer noImages) {
        this.noImages = noImages;
    }

    public Integer getStartImgNumber() {
        return this.startImgNumber;
    }

    public void setStartImgNumber(Integer startImgNumber) {
        this.startImgNumber = startImgNumber;
    }

    public Integer getNoPasses() {
        return this.noPasses;
    }

    public void setNoPasses(Integer noPasses) {
        this.noPasses = noPasses;
    }

    public String getImgDir() {
        return this.imgDir;
    }

    public void setImgDir(String imgDir) {
        this.imgDir = imgDir;
    }

    public String getImgPrefix() {
        return this.imgPrefix;
    }

    public void setImgPrefix(String imgPrefix) {
        this.imgPrefix = imgPrefix;
    }

    public String getImgSuffix() {
        return this.imgSuffix;
    }

    public void setImgSuffix(String imgSuffix) {
        this.imgSuffix = imgSuffix;
    }

    public String getFileTemplate() {
        return this.fileTemplate;
    }

    public void setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
    }

    public String getSnapshot1() {
        return this.snapshot1;
    }

    public void setSnapshot1(String snapshot1) {
        this.snapshot1 = snapshot1;
    }

    public String getSnapshot2() {
        return this.snapshot2;
    }

    public void setSnapshot2(String snapshot2) {
        this.snapshot2 = snapshot2;
    }

    public String getSnapshot3() {
        return this.snapshot3;
    }

    public void setSnapshot3(String snapshot3) {
        this.snapshot3 = snapshot3;
    }

    public String getSnapshot4() {
        return this.snapshot4;
    }

    public void setSnapshot4(String snapshot4) {
        this.snapshot4 = snapshot4;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
