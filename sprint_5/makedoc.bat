rem echo off
set SPRINTDIR=%~dp0
set ASCIIDOCDIR=.\tools\asciidoc-8.6.9\
set PLANTUMLDIR=.\tools\
set SRCDOCDIR=./srcdoc/
set DOCDIR=./doc/

set GENPUML=0

@echo ///////////////////////////////////////////////////////
@echo // COMPILATION des diagrammes de classes
@echo ///////////////////////////////////////////////////////
if "%GENPUML%"=="1" (
	java -jar %PLANTUMLDIR%plantuml.jar -o images %SRCDOCDIR%default.puml
	java -jar %PLANTUMLDIR%plantuml.jar -o images %SRCDOCDIR%model.puml
)

@echo ///////////////////////////////////////////////////////
@echo // COMPILATION des documentations
@echo ///////////////////////////////////////////////////////
python %ASCIIDOCDIR%asciidoc.py -a iconsdir=../%ASCIIDOCDIR%/images -o %DOCDIR%docUtilisateur.html %SRCDOCDIR%docUtilisateur.txt

python %ASCIIDOCDIR%asciidoc.py -a iconsdir=../%ASCIIDOCDIR%/images -o %DOCDIR%docTechnique.html %SRCDOCDIR%docTechnique.txt