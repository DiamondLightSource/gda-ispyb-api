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
package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class IspybXpdfDAO implements IspybXpdfApi {
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

    public List<SampleGroup> retrieveSamplesForSampleGroup(Long sampleGroupId){
        Map<String, Object> map = new HashMap<>();
        map.put("sampleGroupId", sampleGroupId);
        return templateWrapper.callIspybForListBeans("retrieve_samples_for_sample_group", SampleGroup.class, map);
    }
    
    public List<Component> retrieveComponentsForSampleType(Long sampleTypeId){
        Map<String, Object> map = new HashMap<>();
        map.put("sampleTypeId", sampleTypeId);
        return templateWrapper.callIspybForListBeans("retrieve_components_for_sample_type", Component.class, map);
    }

    public List<DataCollectionPlan> retrieveDataCollectionPlansForSample(Long sampleId){
        Map<String, Object> map = new HashMap<>();
        map.put("sampleId", sampleId);
        return templateWrapper.callIspybForListBeans("retrieve_dc_plans_for_sample", DataCollectionPlan.class, map);
    }

    @Override
    public DataCollectionPlanInfo retrieveDataCollectionPlanInfoForSample(Long sampleId) {
        throw new IllegalArgumentException("not implemented");
    }

    public List<ComponentLattice> retrieveComponentLatticesForComponent(Long componentId){
        Map<String, Object> map = new HashMap<>();
        map.put("componentId", componentId);
        return templateWrapper.callIspybForListBeans("retrieve_component_lattices_for_component", ComponentLattice.class, map);
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
