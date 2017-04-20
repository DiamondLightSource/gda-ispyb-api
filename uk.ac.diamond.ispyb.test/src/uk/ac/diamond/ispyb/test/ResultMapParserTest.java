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

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.junit.Test;

import uk.ac.diamond.ispyb.dao.ResultMapParser;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResultMapParserTest {
	@Test
	public void testShouldExtractListFromSingleResultSet(){
		Map<String, Object> map = new HashMap<>();
		HashMap<String, Object> item = new HashMap<>();
		map.put("key containing word result", Arrays.asList(item));
		item.put("id", 12345);
		
		Function<Map<String,Object>, Integer> converter = (i -> (int)i.get("id"));
		List<Integer> result = new ResultMapParser().parse(map, converter);
		
		assertThat(result, is(equalTo(Arrays.asList(12345))));
	}

	@Test
	public void testShouldExtractSingleItemIfThereIsNoResultSet(){
		Map<String, Object> map = new HashMap<>();
		map.put("id", 12345);
		
		Function<Map<String,Object>, Integer> converter = (i -> (int)i.get("id"));
		List<Integer> result = new ResultMapParser().parse(map, converter);
		
		assertThat(result, is(equalTo(Arrays.asList(12345))));
	}	
}
