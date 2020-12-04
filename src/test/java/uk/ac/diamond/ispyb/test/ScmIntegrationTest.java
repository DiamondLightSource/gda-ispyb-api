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
package uk.ac.diamond.ispyb.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.diamond.ispyb.api.*;
import uk.ac.diamond.ispyb.dao.IspybScmDaoFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScmIntegrationTest {
	private final static IntegrationTestHelper<IspybScmApi> helper = new IntegrationTestHelper<>(new IspybScmDaoFactory());

	@BeforeClass
	public static void connect() throws Exception {
		helper.setUp();
	};

	@AfterClass
	public static void disconnect() throws Exception {
		helper.tearDown();
	};

	@Test
	public void testRetrieveSample1() throws SQLException, IOException, InterruptedException {
		ScmSample expected = new ScmSample();
		expected.setSampleId(398828L);
		expected.setContainerId(34888L);
		expected.setSampleName("hello");
		expected.setSampleCode("hello");
		expected.setSampleLocation("1");
		expected.setSampleStatus(null);
		expected.setProposalId(37027L);
		expected.setProposalCode("cm");
		expected.setProposalNumber("14451");
		expected.setSessionId(339535L);

		ScmSample scmSample1 = helper.execute(api -> api.retrieveSample(398828L, false, null)).get();
		assertThat(scmSample1, is(equalTo(expected)));
		ScmSample scmSample2 = helper.execute(api -> api.retrieveSample(398828L, false, "boaty")).get();
		assertThat(scmSample2, is(equalTo(expected)));

		expected.setSessionNumber(99L);

		ScmSample scmSample3 = helper.execute(api -> api.retrieveSample(398828L, true, null)).get();
		assertThat(scmSample3, is(equalTo(expected)));
		ScmSample scmSample4 = helper.execute(api -> api.retrieveSample(398828L, true, "boaty")).get();
		assertThat(scmSample4, is(equalTo(expected)));
	}

	@Test
	public void testRetrieveSample2() throws SQLException, IOException, InterruptedException {
		ScmSample expected = new ScmSample();
		expected.setSampleId(398828L);
		expected.setContainerId(34888L);
		expected.setSampleName("hello");
		expected.setSampleCode("hello");
		expected.setSampleLocation("1");
		expected.setSampleStatus(null);
		expected.setProposalId(37027L);
		expected.setProposalCode("cm");
		expected.setProposalNumber("14451");
		expected.setSessionId(339535L);

		ScmSample scmSample1 = helper.execute(api -> api.retrieveSample("VMXiSim-001", "1", false, null)).get();
		assertThat(scmSample1, is(equalTo(expected)));
		ScmSample scmSample2 = helper.execute(api -> api.retrieveSample("VMXiSim-001", "1", false, "boaty")).get();
		assertThat(scmSample2, is(equalTo(expected)));

		expected.setSessionNumber(99L);

		ScmSample scmSample3 = helper.execute(api -> api.retrieveSample("VMXiSim-001", "1", true, null)).get();
		assertThat(scmSample3, is(equalTo(expected)));
		ScmSample scmSample4 = helper.execute(api -> api.retrieveSample("VMXiSim-001", "1", true, "boaty")).get();
		assertThat(scmSample4, is(equalTo(expected)));
	}

	private ScmSample getScmSampleWithId(Long sampleId, List<ScmSample> scmSampleList) {
		ScmSample scmSample = null;
		Iterator<ScmSample> it = scmSampleList.iterator();
		while (it.hasNext()) {
			scmSample = it.next();
			if (scmSample.getSampleId().equals(sampleId)) {
				return scmSample;
			}
		}
		return null;
	}

	@Test
	public void testRetrieveSamples() throws SQLException, IOException, InterruptedException {
		ScmSample expected = new ScmSample();
		expected.setSampleId(398828L);
		expected.setContainerId(34888L);
		expected.setSampleName("hello");
		expected.setSampleCode("hello");
		expected.setSampleLocation("1");
		expected.setSampleStatus(null);
		expected.setProposalId(37027L);
		expected.setProposalCode("cm");
		expected.setProposalNumber("14451");
		expected.setSessionId(339535L);

		List<ScmSample> scmSampleList1 = helper.execute(api -> api.retrieveSamples(34888L, false, null));
		ScmSample scmSample1 = getScmSampleWithId(398828L, scmSampleList1);
		assertThat(scmSample1, is(equalTo(expected)));
		List<ScmSample> scmSampleList2 = helper.execute(api -> api.retrieveSamples(34888L, false, "boaty"));
		ScmSample scmSample2 = getScmSampleWithId(398828L, scmSampleList2);
		assertThat(scmSample2, is(equalTo(expected)));

		expected.setSessionNumber(99L);

		List<ScmSample> scmSampleList3 = helper.execute(api -> api.retrieveSamples(34888L, true, null));
		ScmSample scmSample3 = getScmSampleWithId(398828L, scmSampleList3);
		assertThat(scmSample3, is(equalTo(expected)));
		List<ScmSample> scmSampleList4 = helper.execute(api -> api.retrieveSamples(34888L, true, "boaty"));
		ScmSample scmSample4 = getScmSampleWithId(398828L, scmSampleList4);
		assertThat(scmSample4, is(equalTo(expected)));
	}


	@Test
	public void testRetrieveContainer1() throws SQLException, IOException, InterruptedException {
		ScmContainer expected = new ScmContainer();
		expected.setContainerId(34888L);
		expected.setDewarId(8578L);
		expected.setSessionId(339535L);
		expected.setProposalId(37027L);
		expected.setOwnerId(1L);
		expected.setOwnerUsername("boaty");
		expected.setName("TestSim01");
		expected.setType("CrystalQuickX");
		expected.setBarcode("VMXiSim-001");
		expected.setBeamline("i02-2");
		expected.setLocation("1");
		expected.setStatus(ContainerStatus.IN_STORAGE.getStatus());
		expected.setCapacity(192);
		expected.setProposalCode("cm");
		expected.setProposalNumber(14451);

		ScmContainer scmContainer1 = helper.execute(api -> api.retrieveContainer(34888L, false, null)).get();
		assertThat(scmContainer1, is(equalTo(expected)));

		ScmContainer scmContainer2 = helper.execute(api -> api.retrieveContainer(34888L, false, "boaty")).get();
		assertThat(scmContainer2, is(equalTo(expected)));

		expected.setSessionNumber(99);

		ScmContainer scmContainer3 = helper.execute(api -> api.retrieveContainer(34888L, true, null)).get();
		assertThat(scmContainer3, is(equalTo(expected)));
		ScmContainer scmContainer4 = helper.execute(api -> api.retrieveContainer(34888L, true, "boaty")).get();
		assertThat(scmContainer4, is(equalTo(expected)));
	}

	@Test
	public void testRetrieveContainer2() throws SQLException, IOException, InterruptedException {
		ScmContainer expected = new ScmContainer();
		expected.setContainerId(34888L);
		expected.setDewarId(8578L);
		expected.setSessionId(339535L);
		expected.setProposalId(37027L);
		expected.setOwnerId(1L);
		expected.setOwnerUsername("boaty");
		expected.setName("TestSim01");
		expected.setType("CrystalQuickX");
		expected.setBarcode("VMXiSim-001");
		expected.setBeamline("i02-2");
		expected.setLocation("1");
		expected.setStatus(ContainerStatus.IN_STORAGE.getStatus());
		expected.setCapacity(192);
		expected.setProposalCode("cm");
		expected.setProposalNumber(14451);

		ScmContainer scmContainer1 = helper.execute(api -> api.retrieveContainer("VMXiSim-001", false, null)).get();
		assertThat(scmContainer1, is(equalTo(expected)));

		ScmContainer scmContainer2 = helper.execute(api -> api.retrieveContainer("VMXiSim-001", false, "boaty")).get();
		assertThat(scmContainer2, is(equalTo(expected)));

		expected.setSessionNumber(99);

		ScmContainer scmContainer3 = helper.execute(api -> api.retrieveContainer("VMXiSim-001", true, null)).get();
		assertThat(scmContainer3, is(equalTo(expected)));
		ScmContainer scmContainer4 = helper.execute(api -> api.retrieveContainer("VMXiSim-001", true, "boaty")).get();
		assertThat(scmContainer4, is(equalTo(expected)));
	}

	private ScmContainer getScmContainerWithId(Long containerId, List<ScmContainer> scmContainerList) {
		ScmContainer scmContainer = null;
		Iterator<ScmContainer> it = scmContainerList.iterator();
		while (it.hasNext()) {
			scmContainer = it.next();
			if (scmContainer.getContainerId().equals(containerId)) {
				return scmContainer;
			}
		}
		return null;
	}

	@Test
	public void testRetrieveContainers() throws SQLException, IOException, InterruptedException {
		ScmContainer expected = new ScmContainer();
		expected.setContainerId(34888L);
		expected.setDewarId(8578L);
		expected.setSessionId(339535L);
		expected.setProposalId(37027L);
		expected.setOwnerId(1L);
		expected.setOwnerUsername("boaty");
		expected.setName("TestSim01");
		expected.setType("CrystalQuickX");
		expected.setBarcode("VMXiSim-001");
		expected.setBeamline("i02-2");
		expected.setLocation("1");
		expected.setStatus(ContainerStatus.IN_STORAGE.getStatus());
		expected.setCapacity(192);
		expected.setProposalCode("cm");
		expected.setProposalNumber(14451);

		List<ScmContainer> scmContainerList1 = helper.execute(api -> api.retrieveContainers("cm", "14451", null, ContainerStatus.IN_STORAGE.getStatus(), null));
		ScmContainer scmContainer1 = getScmContainerWithId(34888L, scmContainerList1);
		assertThat(scmContainer1, is(equalTo(expected)));

		List<ScmContainer> scmContainerList2 = helper.execute(api -> api.retrieveContainers("cm", "14451", null, ContainerStatus.IN_STORAGE.getStatus(), "boaty"));
		ScmContainer scmContainer2 = getScmContainerWithId(34888L, scmContainerList2);
		assertThat(scmContainer2, is(equalTo(expected)));

		expected.setSessionNumber(99);

		List<ScmContainer> scmContainerList3 = helper.execute(api -> api.retrieveContainers("cm", "14451", 99L, ContainerStatus.IN_STORAGE.getStatus(), null));
		ScmContainer scmContainer3 = getScmContainerWithId(34888L, scmContainerList3);
		assertThat(scmContainer3, is(equalTo(expected)));
		List<ScmContainer> scmContainerList4 = helper.execute(api -> api.retrieveContainers("cm", "14451", 99L, ContainerStatus.IN_STORAGE.getStatus(), "boaty"));
		ScmContainer scmContainer4 = getScmContainerWithId(34888L, scmContainerList4);
		assertThat(scmContainer4, is(equalTo(expected)));
	}

}
