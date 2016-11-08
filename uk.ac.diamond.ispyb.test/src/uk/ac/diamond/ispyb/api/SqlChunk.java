package uk.ac.diamond.ispyb.api;

import java.util.ArrayList;
import java.util.List;

public class SqlChunk {
	private final String delimiter;
	private final List<String> sql;

	public SqlChunk(String delimiter) {
		this.delimiter = delimiter;
		this.sql = new ArrayList<>();
	}

	public SqlChunk(SqlChunk first, SqlChunk second) {
		this.delimiter = first.delimiter;
		this.sql = new ArrayList<>();
		sql.addAll(first.sql);
		sql.addAll(second.sql);
	}		

	public void append(String newStatement) {
		sql.add(newStatement);
	}

	public String getDelimiter() {
		return delimiter;
	}
	
	public String toSqlString(){
		return sql.stream().reduce("", (x,y)-> x + '\n' + y);
	}
}
