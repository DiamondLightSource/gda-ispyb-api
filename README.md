[![Build Status](https://travis-ci.org/DiamondLightSource/gda-ispyb-api.svg?branch=master)](https://travis-ci.org/DiamondLightSource/gda-ispyb-api)

This is a Java library for accessing Diamond's ISPyB database.

Examples
--------

For example usage, see the integration tests, e.g. [PlateIntegrationTest](https://github.com/DiamondLightSource/gda-ispyb-api/blob/master/src/test/java/uk/ac/diamond/ispyb/test/PlateIntegrationTest.java).

Tests
-----

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
mvn -Dispyb.url=jdbc:mariadb://localhost/ -Dispyb.user=maven -Dispyb.pw='password_here' -Dispyb.host=localhost package
```

Release
-------

To release, use the script `release.sh`. You need to supply this with the argument `major`, `minor`, or `bugfix`, and this script will handle updating the version. The result will be added to GitHub as a release by Travis.
