

Running Junit Test Classes from IDE
===================================

1. You need to install mysql and have that command available to a shell or batch script (depending on os).
   MacOS is not currently supported.
   In my case on Windows I installed community server and ensured that its 'bin' folder was on the path (needed eclipse restart)

2. Variables
You need the following system properties to run with the test db:
-Dispyb.url=jdbc:mariadb://cs04r-sc-vserv-19:4306 
-Dispyb.user=$$$$$$
-Dispyb.pw=$$$$$$ 
-Dispyb.host=cs04r-sc-vserv-19 
-Dispyb.port=4306

These properties work inside the Diamond Intranet.
$$$$$$ - The password and user name for the database are required. 
(Please contact Kevin Savage, Karl Levik or another member of the scisoft team for these.)

