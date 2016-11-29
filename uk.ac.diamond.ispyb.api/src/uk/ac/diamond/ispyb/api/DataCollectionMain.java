
package uk.ac.diamond.ispyb.api;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionMain {

    private int id;
    private int groupId;
    private int detectorId;
    private int dcNumber;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private int noImages;
    private int startImgNumber;
    private int noPasses;
    private String imgDir;
    private String imgPrefix;
    private String imgSuffix;
    private String fileTemplate;
    private String snapshot1;
    private String snapshot2;
    private String snapshot3;
    private String snapshot4;
    private String comments;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return this.groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getDetectorId() {
        return this.detectorId;
    }

    public void setDetectorId(int detectorId) {
        this.detectorId = detectorId;
    }

    public int getDcNumber() {
        return this.dcNumber;
    }

    public void setDcNumber(int dcNumber) {
        this.dcNumber = dcNumber;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoImages() {
        return this.noImages;
    }

    public void setNoImages(int noImages) {
        this.noImages = noImages;
    }

    public int getStartImgNumber() {
        return this.startImgNumber;
    }

    public void setStartImgNumber(int startImgNumber) {
        this.startImgNumber = startImgNumber;
    }

    public int getNoPasses() {
        return this.noPasses;
    }

    public void setNoPasses(int noPasses) {
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
