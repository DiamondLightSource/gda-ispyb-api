@echo off
REM Windows Batch. It be more complex than bash me hearties

setlocal enableextensions enabledelayedexpansion
call :getargc argc %*   
if %argc%==6 goto :password
if %argc%==5 goto :nopassword
endlocal
goto :eof

REM with password
:password
	echo C:/mysql/bin/mysql -h %1 -u%2 -p%3 -P %4 %5 < %6
	C:/mysql/bin/mysql -h %1 -u%2 -p%3 -P %4 %5 < %6
    goto :eof

REM without password not supported
:nopassword	   
	echo C:/mysql/bin/mysql -h %1 -u%2 -P %3 %4 < %5
	C:/mysql/bin/mysql -h %1 -u%2 -P %3 %4 < %5
    goto :eof
	
REM Get argument count
:getargc
	set getargc_v0=%1
	set /a "%getargc_v0% = 0"
:getargc_l0
	if not x%2x==xx (
		shift
		set /a "%getargc_v0% = %getargc_v0% + 1"
		goto :getargc_l0
	)
	set getargc_v0=
	goto :eof