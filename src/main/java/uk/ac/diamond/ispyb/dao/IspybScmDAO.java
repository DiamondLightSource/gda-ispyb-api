/*-
 *******************************************************************************
 * Copyright (c) 2011, 2020 Diamond Light Source Ltd.
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
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class IspybScmDAO implements IspybScmApi {
    private final TemplateWrapper templateWrapper;

    public IspybScmDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper) {
        this.templateWrapper = templateWrapper;
    }

    public Optional<ScmSample> retrieveSample(Long sampleId, boolean useContainerSession, String authLogin) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", sampleId);
        map.put("useContainerSession", useContainerSession);
        map.put("authLogin", authLogin);
        return templateWrapper.callIspybForBean("retrieve_scm_sample", ScmSample.class, map);
    }

    @Override
    public Optional<ScmSample> retrieveSample(String containerBarcode, String sampleLocation,
        boolean useContainerSession, String authLogin) throws SQLException {
            Map<String, Object> map = new HashMap<>();
            map.put("barcode", containerBarcode);
            map.put("location", sampleLocation);
            map.put("useContainerSession", useContainerSession);
            map.put("authLogin", authLogin);
            return templateWrapper.callIspybForBean("retrieve_scm_sample_for_container_barcode_and_location", ScmSample.class, map);
    }

    @Override
    public List<ScmSample> retrieveSamples(Long containerId, boolean useContainerSession, String authLogin)
        throws SQLException {
            Map<String, Object> map = new HashMap<>();
            map.put("containerId", containerId);
            map.put("useContainerSession", useContainerSession);
            map.put("authLogin", authLogin);
            return templateWrapper.callIspybForListBeans("retrieve_scm_samples_for_container_id", ScmSample.class, map);
    }

    @Override
    public Optional<ScmContainer> retrieveContainer(Long containerId, boolean useContainerSession, String authLogin)
            throws SQLException {
                Map<String, Object> map = new HashMap<>();
                map.put("id", containerId);
                map.put("useContainerSession", useContainerSession);
                map.put("authLogin", authLogin);
                return templateWrapper.callIspybForBean("retrieve_scm_container", ScmContainer.class, map);
    }

    @Override
    public Optional<ScmContainer> retrieveContainer(String containerBarcode, boolean useContainerSession,
            String authLogin) throws SQLException {
                Map<String, Object> map = new HashMap<>();
                map.put("barcode", containerBarcode);
                map.put("useContainerSession", useContainerSession);
                map.put("authLogin", authLogin);
                return templateWrapper.callIspybForBean("retrieve_scm_container_for_barcode", ScmContainer.class, map);
    }

    @Override
    public List<ScmContainer> retrieveContainers(String proposalCode, String proposalNumber, Long sessionNumber,
            String containerStatus, String authLogin) throws SQLException {
                Map<String, Object> map = new HashMap<>();
                map.put("proposalCode", proposalCode);
                map.put("proposalNumber", proposalNumber);            
                map.put("sessionNumber", sessionNumber);
                map.put("status", containerStatus);
                map.put("authLogin", authLogin);
                return templateWrapper.callIspybForListBeans("retrieve_scm_containers_for_session", ScmContainer.class, map);
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
