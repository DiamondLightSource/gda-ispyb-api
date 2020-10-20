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
import java.util.Map;
import java.util.Optional;

public class IspybMxDAO implements IspybMxApi{
    private final TemplateWrapper templateWrapper;

    public IspybMxDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper){
        this.templateWrapper = templateWrapper;
    }

    public Optional<MxSample> retrieveSample(Long sampleId, boolean useContainerSession, String authLogin) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", sampleId);
        map.put("useContainerSession", useContainerSession);
        map.put("authLogin", authLogin);
        return templateWrapper.callIspybForBean("retrieve_sample", MxSample.class, map);
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
