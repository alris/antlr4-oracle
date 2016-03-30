#!/bin/sh

###############################################################################
source common.sh

grammar=plsql.g4
###############################################################################

echo "Building antlr4 files for java!"
antlr4 $grammar $* -Dlanguage=Java

echo "Compiling java!"
[ -d 'internal_class' ] || mkdir internal_class
javac -g:none -d internal_class *.java
