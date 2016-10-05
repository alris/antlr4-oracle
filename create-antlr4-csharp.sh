#!/bin/sh
current_dir=$(dirname $0)

###############################################################################
source $current_dir/common.sh
###############################################################################

src_path=$current_dir/csharp/src

# нужно использовать jar из пакета, чтобы он верно сгенеирровал исходники
export CLASSPATH="$current_dir/csharp/packages/Antlr4.4.5.3/tools/antlr4-csharp-4.5.3-complete.jar:$CLASSPATH"

echo "Creating antlr4 files for csharp!"

make_grammar_with grammar/csharp_addon.g4

antlr4 $grammar $* -Dlanguage=CSharp_v4_0 -o $src_path -visitor
