#!/bin/sh
current_dir=$(dirname $0)

###############################################################################
source $current_dir/common.sh
###############################################################################

echo "Building antlr4 files for java!"
antlr4 $grammar $* -Dlanguage=Java -o $src_path -visitor

echo "Compiling java!"
[ -d 'internal_class' ] || mkdir internal_class
javac -g:none -d internal_class $src_path/*.java 
