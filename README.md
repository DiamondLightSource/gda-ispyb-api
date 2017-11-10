[![Build Status](https://travis-ci.org/DiamondLightSource/gda-ispyb-api.svg?branch=master)](https://travis-ci.org/DiamondLightSource/gda-ispyb-api)

This is a java library for accessing Diamonds ISPyB database.

Examples
--------

For example usage, see the integration tests, e.g. [PlateInterationTest](https://github.com/DiamondLightSource/gda-ispyb-api/blob/master/src/test/java/uk/ac/diamond/ispyb/test/PlateIntegrationTest.java)


Tests
-----

To build and test the jars: 

mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} package

Release
-------

To release, use the script release.sh. You need to supply this with major, minor or bugfix and ths script will handle updating the version. The result will be added to Github as a release by Travis.   
