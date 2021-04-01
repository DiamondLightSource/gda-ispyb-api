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
import java.util.Optional;

public class IspybDataCollectionDAO implements IspybDataCollectionApi {

	private TemplateWrapper templateWrapper;
	private BeanTemplateWrapper beanTemplateWrapper;

	public IspybDataCollectionDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper) {
		this.templateWrapper = templateWrapper;
		this.beanTemplateWrapper = beanTemplateWrapper;
	}

	@Override
	public Optional<Detector> retrieveDetector(String serialNumber) throws SQLException {
		return templateWrapper.callIspybForBean("retrieve_detector", Detector.class, map("serialNumber", serialNumber));
	}

	@Override
	public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		return beanTemplateWrapper.callIspybForKey("upsert_dc_group_v3", Long.class, dataCollectionGroup, "p_id").get();
	}

	@Override
	public Optional<DataCollectionGroup> retrieveDataCollectionGroup(Long dcgId) throws SQLException {
		return templateWrapper.callIspybForBean("retrieve_dc_group", DataCollectionGroup.class, map("id", dcgId));
	}

	@Override
	public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain) {
		return beanTemplateWrapper.callIspybForKey("upsert_dc_main_v3", Long.class, dataCollectionMain, "p_id").get();
	}

	@Override
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
		beanTemplateWrapper.callIspyb("update_dc_experiment_v2", dataCollectionExperiment);
	}

	@Override
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {
		beanTemplateWrapper.callIspyb("update_dc_machine", dataCollectionMachine);
	}

	@Override
	public Long upsertDataCollectionGroupGrid(DataCollectionGroupGrid dataCollectionGroupGrid) {
		return beanTemplateWrapper.callIspybForKey("upsert_dcg_grid", Long.class, dataCollectionGroupGrid, "p_id").get();
	}

	@Override
        public void updateDataCollectionPosition(Position position) {
		beanTemplateWrapper.callIspyb("update_dc_position", position);
        }

	@Override
	public Long insertBeamlineAction(BeamlineAction beamlineAction){
		return beanTemplateWrapper.callIspybForKey("insert_beamline_action", Long.class, beamlineAction, "p_id").get();
	}

	@Override
	public Long upsertRobotAction(RobotAction robotAction){
		return beanTemplateWrapper.callIspybForKey("upsert_robot_action", Long.class, robotAction, "p_id").get();
	}

	@Override
	public void close() throws IOException {
		try {
			templateWrapper.closeConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

	private Map<String, Object> map(String key, Object value) {
		Map<String, Object> map = new HashMap<>();
		map.put(key, value);
		return map;
	}

}
