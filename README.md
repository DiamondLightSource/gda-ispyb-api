To build and test the jars you should just need to run: 

mvn -Dispyb.url={jdbc_url} -Dispyb.user={user} -Dispyb.pw={password} -Dispyb.host={host} clean compile surefire:test package

