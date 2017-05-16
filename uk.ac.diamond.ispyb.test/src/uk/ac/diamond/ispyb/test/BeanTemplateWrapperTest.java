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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.BeanTemplateWrapper;
import uk.ac.diamond.ispyb.dao.TemplateWrapper;

public class BeanTemplateWrapperTest {
	
	@Ignore("Does not work with mockito version in orbit http://download.eclipse.org/tools/orbit/downloads/drops/R20160520211859/")
	@Test
	public void testUpdate(){
		TemplateWrapper wrapper = mock(TemplateWrapper.class);
		
		TestBean bean = new TestBean();
		new BeanTemplateWrapper(wrapper, null).updateIspyb("proc", bean);
		
		Map<String, Object> map = new HashMap<>();
		map.put("i", 5);
		map.put("s", "s");
		
		verify(wrapper).updateIspyb("proc", map);
	}
	
	static class TestBean {
		public int getI(){
			return 5;
		}
		public String getS(){
			return "s";
		}
	}
}
