rem echo off
set SPRINTDIR=%~dp0
set SRCDIR=./src/
set BINDIR=./bin/

set RUNTEST=1
set LAUNCHAPPI=1

@echo ///////////////////////////////////////////////////////
@echo // COMPILATION des executables
@echo ///////////////////////////////////////////////////////
javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%*.java

@echo ///////////////////////////////////////////////////////
@echo // COMPILATION des modèles
@echo ///////////////////////////////////////////////////////
javac -cp .;%BINDIR% -d %BINDIR% %SRCDIR%model/*.java



@echo ///////////////////////////////////////////////////////
@echo // EXECUTION des tests
@echo ///////////////////////////////////////////////////////
if "%RUNTEST%"=="1" (
 cd %BINDIR%
 java -cp .;../tools/junit.jar LibCSVTest
 java -cp .;../tools/junit.jar MakeOPTIwebTest
 cd %SPRINTDIR%
)

@echo ///////////////////////////////////////////////////////
@echo // EXECUTION de l'application
@echo ///////////////////////////////////////////////////////
if "%LAUNCHAPPI%"=="1" (
 cd %BINDIR%
 java -cp .;.. MakeOPTIweb
 cd %SPRINTDIR%
)