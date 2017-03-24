package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.api.Sample;
import uk.ac.diamond.ispyb.api.SampleGroup;

public class IspybXpdfDAO implements IspybXpdfApi{
    private final TemplateWrapper templateWrapper;
    private final BeanTemplateWrapper beanTemplateWrapper;

    public IspybXpdfDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper){
        this.templateWrapper = templateWrapper;
        this.beanTemplateWrapper = beanTemplateWrapper;
    }

    public List<Sample> retrieveSamplesAssignedForProposal(String proposalCode, Long proposalNumber){
        Map<String, Object> map = new HashMap<>();
        map.put("proposalCode", proposalCode);
        map.put("proposalNumber", proposalNumber);
        return templateWrapper.callIspybForListBeans("retrieve_samples_assigned_for_proposal", Sample.class, map);
    }

    public List<SampleGroup> retrieveSampleGroupsForSample(Long sampleId){
        Map<String, Object> map = new HashMap<>();
        map.put("sampleId", sampleId);
        return templateWrapper.callIspybForListBeans("retrieve_sample_groups_for_sample", SampleGroup.class, map);
    }

    @Override
    public void close() throws IOException {
        try {
            templateWrapper.closeConnection();
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }
}
