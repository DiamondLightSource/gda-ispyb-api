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

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ResultMapParser {
	@SuppressWarnings("unchecked")
	public <T> List<T> parse(Map<String, Object> resultMap, Function<Map<String, Object>, T> converter) {
		return resultMap.entrySet().stream()
			.filter(entry -> entry.getKey().contains("result"))
			.findAny()
			.map(entry -> (List<Map<String, Object>>) entry.getValue())
			.map(results -> results.stream().map(converter).collect(Collectors.toList()))
			.orElseGet(() -> Arrays.asList(converter.apply(resultMap)));
	}
}
