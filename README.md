[![Build Status](https://travis-ci.org/DiamondLightSource/gda-ispyb-api.svg?branch=master)](https://travis-ci.org/DiamondLightSource/gda-ispyb-api)

# GDA ISPyB API

This is a Java library for accessing a Diamond-flavour ISPyB database. It's designed for server-side-only usage, utilising stored procedures to access the database tables. A key benefit of this apporach is the ability to modify the behaviour of the library methods without downtime and without building and deploying a new version of the library itself. A simple change to a stored procedure is very quick and runs in a transaction without disrupting access to the database.

The stored procedures are maintained in a separate repository: [ispyb-database](https://github.com/DiamondLightSource/ispyb-database).

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
mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} package
```

Example:

```bash
mvn -Dispyb.url='jdbc:mariadb://localhost:3306' -Dispyb.user=maven -Dispyb.pw='password_here' -Dispyb.host=localhost package
```

To run a particular test class:

```bash
mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} -Dtest={TestClassName} test
```

## Release

To release, use the script `release.sh`. You need to supply this with the argument `major`, `minor`, or `bugfix`, and this script will handle updating the version. The result will be added to GitHub as a release by Travis.
