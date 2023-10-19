[![Build Status](https://dev.azure.com/diamond-lims/gda-ispyb-api/_apis/build/status/DiamondLightSource.gda-ispyb-api?branchName=master)](https://dev.azure.com/diamond-lims/gda-ispyb-api/_build/latest?definitionId=1&branchName=master)

# GDA ISPyB API

This is a Java library for accessing a Diamond-flavour ISPyB database. It's designed for server-side-only usage, utilising stored procedures to access the database tables. A key benefit of this approach is the ability to modify the behaviour of the library methods without downtime and without building and deploying a new version of the library itself. A simple change to a stored procedure is very quick and runs in a transaction without disrupting access to the database.

The stored procedures are maintained in a separate repository: [ispyb-database](https://github.com/DiamondLightSource/ispyb-database).

## Build requirements

* MariaDB 10.3 or later
* JDK 1.8 (also appears to work with 11) JRE and development packages (e.g. on Fedora: java-1.8.0-openjdk java-1.8.0-openjdk-devel)
* Maven

## Documentation

The javadocs are currently hosted at [https://alfred.diamond.ac.uk/documentation/javadocs/gda-ispyb-api/](https://alfred.diamond.ac.uk/documentation/javadocs/gda-ispyb-api/).

## Examples

For example usage, see the integration tests, e.g. [PlateIntegrationTest](https://github.com/DiamondLightSource/gda-ispyb-api/blob/master/src/test/java/uk/ac/diamond/ispyb/test/PlateIntegrationTest.java).

## Tests

To create the database user, run e.g. these SQL commands:

```sql
CREATE USER maven@localhost IDENTIFIED BY 'password_here';

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `maven\_%`.* TO 'maven'@'localhost';
```

To build and test the JARs:

```bash
mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} -Dispyb.port={port} package
```

Example:

```bash
mvn -Dispyb.url='jdbc:mariadb://localhost:3306' -Dispyb.user=maven -Dispyb.pw='password_here' -Dispyb.host=localhost -Dispyb.port=3306 package
```

To run a particular test class:

```bash
mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} -Dispyb.port={port} -Dtest={TestClassName} test
```

To generate javadocs:

```bash
mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} -Dispyb.port={port} install
```

The javadocs will then appear in a folder called `target/apidocs/`.

## Release

To release, use the script `release.sh` with the argument `major`, `minor`, or `bugfix`. This script will handle updating the version. The result will be added to GitHub as a release by Azure Pipelines.
