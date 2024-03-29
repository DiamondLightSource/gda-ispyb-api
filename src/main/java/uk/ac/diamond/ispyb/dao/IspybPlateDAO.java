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
import java.sql.Timestamp;
import java.util.*;

public class IspybPlateDAO implements IspybPlateApi{
    private static final String BARCODE = "barcode";
	private static final String BEAMLINE = "beamline";

    private final TemplateWrapper templateWrapper;
	private final BeanTemplateWrapper beanTemplateWrapper;

	public IspybPlateDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper) {
		this.templateWrapper = templateWrapper;
		this.beanTemplateWrapper = beanTemplateWrapper;
	}

	@Override
	public Optional<String> retrieveContainerLSPosition(String barcode) throws SQLException {
		return templateWrapper.callIspyb("retrieve_container_ls_position", String.class, map(BARCODE, barcode));
	}

	@Override
	public Optional<ContainerInfo> retrieveContainerInfo(String barcode) throws SQLException {
		return templateWrapper.callIspybForBean("retrieve_container_info", ContainerInfo.class, map(BARCODE, barcode));
	}

	@Override
	public List<ContainerInfo> retrieveContainerOnGonio(String beamline) throws SQLException{
		return templateWrapper.callIspybForListBeans("retrieve_container_on_gonio", ContainerInfo.class, map(BEAMLINE, beamline));
	}

	@Override
	public void updateContainerLSPosition(String barcode, int position) throws SQLException {
		beanTemplateWrapper.updateIspyb("update_container_ls_position", new BarcodeQuery(barcode, position));
	}

	@Override
	public void updateContainerStatus(String barcode, ContainerStatus status) throws SQLException {
		beanTemplateWrapper.updateIspyb("update_container_status", new BarcodeQuery(barcode, status.getStatus()));
	}

	@Override
	public void finishContainer(String barcode) throws SQLException {
		templateWrapper.updateIspyb("finish_container", map(BARCODE, barcode));
	}

	@Override
	public void updateContainerUnqueue(String barcode) throws SQLException {
		templateWrapper.updateIspyb("update_container_unqueue", map(BARCODE, barcode));
	}

	@Override
	public List<ContainerLSQueueEntry> retrieveContainerLSQueue(String beamline) throws SQLException {
		return templateWrapper.callIspybForListBeans("retrieve_container_ls_queue", ContainerLSQueueEntry.class, map(BEAMLINE, beamline));
	}

        @Override
        public List<ContainerForBeamlineAndStatusEntry> retrieveContainersOnBeamlineWithStatus(String beamline, ContainerStatus status) throws SQLException {
                Map<String, Object> map = new HashMap<>();
                map.put(BEAMLINE, beamline);
                map.put("status", status.getStatus());
                return templateWrapper.callIspybForListBeans("retrieve_containers_on_beamline_with_status", ContainerForBeamlineAndStatusEntry.class, map);
        }

	@Override
	public Optional<Timestamp> retrieveContainerQueueWithMostRecentCompletedTimestamp(String barcode) throws SQLException{
		return templateWrapper.callIspyb("retrieve_container_queue_most_recent_completed_timestamp", Timestamp.class, map(BARCODE, barcode));
	}

	@Override
	public Optional<Date> retrieveContainerQueueTimestamp(String barcode) throws SQLException {
		return templateWrapper.callIspyb("retrieve_container_queue_timestamp", Timestamp.class, map(BARCODE, barcode))
				.map(ts -> (Date)ts);
	}

	@Override
	public List<ContainerSubsample> retrieveContainerSubsamples(String barcode) throws SQLException {
		return templateWrapper.callIspybForListBeans("retrieve_container_subsamples_v2", ContainerSubsample.class, map(BARCODE, barcode));
	}

	@Override
	public void insertContainerError(String barcode, String error, int severity, String stackTrace) throws SQLException {
		beanTemplateWrapper.updateIspyb("insert_container_error", new BarcodeQuery(barcode, error, severity, stackTrace));
	}

	@Override
	public List<DataCollectionInfo> retrieveDataCollectionInfosForSubsample(long id) {
		return templateWrapper.callIspybForListBeans("retrieve_dc_infos_for_subsample", DataCollectionInfo.class, map("id", id));
	}

	@Override
	public void clearContainerError(String barcode) throws SQLException {
		templateWrapper.callIspybForList("clear_container_error", String.class, map(BARCODE, barcode));
	}

	@Override
	public Long upsertSampleImageAnalysis(SampleImageAnalysis sampleImageAnalysis){
		return beanTemplateWrapper.callIspybForKey("upsert_sample_image_analysis", Long.class, sampleImageAnalysis, "p_id").get();
	}

	@Override
	public List<Sleeve> retrieveSleeves() throws SQLException {
		return templateWrapper.callIspybForListBeans("retrieve_sleeves", Sleeve.class, null);
	}

	@Override
	public Byte upsertSleeve(Sleeve sleeve) throws SQLException {
		return beanTemplateWrapper.callIspybForKey("upsert_sleeve", Byte.class, sleeve, "p_id").get();
	}

	@Override
	public void close() throws IOException {
		try {
			templateWrapper.closeConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

	@Override
	public boolean isConnected() {
		return templateWrapper.connected();
	}

	private Map<String, Object> map(String key, Object value) {
		Map<String, Object> map = new HashMap<>();
		map.put(key, value);
		return map;
	}
}
