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
package uk.ac.diamond.ispyb.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
    BeanTemplateWrapperTest.class,
    ContainerStatusTest.class,
    DataCollectionIntegrationTest.class,
    IspybDataCollectionApiTest.class,
    IspybPlateApiTest.class,
    MapToBeanFunctionTest.class,
    MultipleCallsIntegrationTest.class,
    PlateIntegrationTest.class,
    ResultMapParserTest.class,
    XpdfIntegrationTest.class
})
public class Suite {

}
