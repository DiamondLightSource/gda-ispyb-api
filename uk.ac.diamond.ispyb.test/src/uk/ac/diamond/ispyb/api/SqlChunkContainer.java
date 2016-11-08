package uk.ac.diamond.ispyb.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SqlChunkContainer {
	private final List<SqlChunk> chunks = new ArrayList<>();

	public SqlChunkContainer() {
		changeDelimiter(";");
	}

	public SqlChunkContainer(List<SqlChunk> newChunks) {
		chunks.addAll(newChunks);
	}

	public void changeDelimiter(String delimiter) {
		chunks.add(new SqlChunk(delimiter));
	}

	public void append(String newStatement) {
		lastChunk().append(newStatement);
	}

	private SqlChunk lastChunk() {
		return chunks.get(chunks.size()-1);
	}

	public SqlChunkContainer combine(SqlChunkContainer other) {
		SqlChunk lastChunk = lastChunk();
		SqlChunk firstOtherChunk = other.chunks.get(0);
		
		if (lastChunk.getDelimiter().equals(firstOtherChunk.getDelimiter())){
			SqlChunk mergedChunk = new SqlChunk(lastChunk, firstOtherChunk);
			List<SqlChunk> newChunks = new ArrayList<>();
			newChunks.addAll(chunks.subList(0, chunks.size()-2));
			newChunks.add(mergedChunk);
			newChunks.addAll(other.chunks.subList(1, other.chunks.size()-1));
			return new SqlChunkContainer(newChunks);
		} else {
			List<SqlChunk> newChunks = new ArrayList<>();
			newChunks.addAll(this.chunks);
			newChunks.addAll(other.chunks);
			return new SqlChunkContainer(newChunks);
		}
	}

	public List<String> toSqlStrings() {
		return chunks.stream().map(SqlChunk::toSqlString).collect(Collectors.toList());
	}
}
