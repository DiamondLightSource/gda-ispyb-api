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
package uk.ac.diamond.ispyb.scanning.test;


import java.io.IOException;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
    BeanSerializationTest.class,
    DataCollectionTest.class,
    CompositeTest.class,
    AsynchCompositeTest.class,
    SampleInformationTest.class
})
public class Suite {

	@BeforeClass
	public static void create() throws SQLException, IOException, InterruptedException {
		ExperimentServiceTest.setDisposeLocked(true); // Only we will dispose it
		ExperimentServiceTest.create(true, true);
	}
	
	@AfterClass
	public static void dispose() throws Exception {
		ExperimentServiceTest.setDisposeLocked(false); // And now we do
		ExperimentServiceTest.dispose();
	}

}
