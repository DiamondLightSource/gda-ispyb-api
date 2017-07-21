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

import java.util.ArrayList;
import java.util.List;

public class H2UrlBuilder {
	private static final String H2 = "jdbc:h2:mem:test;";
	private static final String MYSQL_MODE = "MODE=MySQL;";
	private static final String INIT = "INIT=DROP ALL OBJECTS\\;";
	private static final String SCHEMA = "CREATE SCHEMA IF NOT EXISTS %s \\;";
	private static final String ALIAS = "CREATE ALIAS ispyb.%s FOR \"%s\" \\;";
	
	private final List<String> initCommands = new ArrayList<>();
	
	public H2UrlBuilder withSchema(String schema){
		return addInitCommand(SCHEMA, schema);
	}

	public H2UrlBuilder withAlias(String name, String method){
		String className = new Exception().getStackTrace()[1].getClassName();
		String fullMethodName = className + "." + method;
		return addInitCommand(ALIAS, name, fullMethodName);
	}
	
	private H2UrlBuilder addInitCommand(String template, Object... args){
		String format = String.format(template, args);
		initCommands.add(format);
		return this;
	}
	
	public String build(){
		StringBuilder url = new StringBuilder(H2);
		if (!initCommands.isEmpty()){
			url.append(MYSQL_MODE);
			url.append(INIT);
			for (String command : initCommands) {
				url.append(command);
			}				
		}
		return url.toString();
	}
}
