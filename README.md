[![Build Status](https://travis-ci.org/DiamondLightSource/gda-ispyb-api.svg?branch=master)](https://travis-ci.org/DiamondLightSource/gda-ispyb-api)

This is a Java library for accessing Diamond's ISPyB database.

Examples
--------

For example usage, see the integration tests, e.g. [PlateIntegrationTest](https://github.com/DiamondLightSource/gda-ispyb-api/blob/master/src/test/java/uk/ac/diamond/ispyb/test/PlateIntegrationTest.java).

Tests
-----

To build and test the JARs:

```
mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} package
```

Release
-------

To release, use the script `release.sh`. You need to supply this with the argument `major`, `minor`, or `bugfix`, and this script will handle updating the version. The result will be added to GitHub as a release by Travis.
