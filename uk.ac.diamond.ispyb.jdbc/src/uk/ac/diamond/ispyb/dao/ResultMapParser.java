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
