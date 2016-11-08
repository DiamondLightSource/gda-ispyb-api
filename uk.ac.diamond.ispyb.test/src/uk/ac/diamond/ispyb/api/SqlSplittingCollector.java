package uk.ac.diamond.ispyb.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import org.apache.commons.lang3.StringUtils;


public class SqlSplittingCollector implements Collector<String, SqlChunkContainer, SqlChunkContainer>{
	@Override
	public Supplier<SqlChunkContainer> supplier() {
		return () -> new SqlChunkContainer();
	}

	@Override
	public BiConsumer<SqlChunkContainer, String> accumulator() {
		return (container, newStatement) -> {
			if (isDelimiter(newStatement)){
				String delimiter = parseDelimiter(newStatement);
				container.changeDelimiter(delimiter);
			} else {
				container.append(newStatement);
			}
		};
	}

	private String parseDelimiter(String newStatement) {
		return StringUtils.removeStartIgnoreCase(newStatement, "DELIMITER").trim();
	}

	private boolean isDelimiter(String newStatement) {
		return newStatement.trim().toUpperCase().startsWith("DELIMITER");
	}

	@Override
	public BinaryOperator<SqlChunkContainer> combiner() {
		return (x, y) -> x.combine(y);
	}

	@Override
	public Set<Characteristics> characteristics() {
		return new HashSet<Characteristics>(Arrays.asList(Characteristics.CONCURRENT, Characteristics.IDENTITY_FINISH));
	}

	@Override
	public Function<SqlChunkContainer, SqlChunkContainer> finisher() {
		return x -> x;
	}

}
