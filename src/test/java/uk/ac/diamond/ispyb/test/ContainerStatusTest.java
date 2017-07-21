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

import org.junit.Test;
import uk.ac.diamond.ispyb.api.ContainerStatus;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContainerStatusTest {
    @Test
    public void testValidParsing(){
        for (ContainerStatus containerStatus: ContainerStatus.values()){
            ContainerStatus parsed = ContainerStatus.convert(containerStatus.getStatus());
            assertThat(parsed, is(containerStatus));
        }
    }


    @Test
    public void testInvalidParsing(){
        ContainerStatus parsed = ContainerStatus.convert("not known");
        assertThat(parsed, is(ContainerStatus.INVALID));
    }
}
