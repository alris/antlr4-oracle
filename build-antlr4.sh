#!/bin/sh

###############################################################################
source common.sh

grammar=plsql.g4
src=src
###############################################################################

echo "Building antlr4 files for java!"
antlr4 $grammar $* -Dlanguage=Java -o $src -visitor

echo "Compiling java!"
[ -d 'internal_class' ] || mkdir internal_class
javac -g:none -d internal_class $src/*.java 
