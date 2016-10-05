#!/bin/sh
current_dir=$(dirname $0)

###############################################################################
antlr='antlr-4.5.3-complete.jar'
###############################################################################

grammar=$current_dir/grammar/PlSql.g4
grammar_template=$current_dir/grammar/PlSql-template.g4

start_rule=sql_script

grammar_class=org.antlr.generated.PlSql

###############################################################################

java_src_path=$current_dir/java/src/Antlr4ParserLexer/src/org/antlr/generated
jar_path=$current_dir/java/src/Antlr4ParserLexer/lib/$antlr
java_internal_class=$current_dir/java/internal_class

# new_analyzer_path=$current_dir/bin/analyzer.jar

###############################################################################
# Java
###############################################################################

#  [-tokens] [-tree] [-gui] [-trace]
JAVA_OPTIONS='-Xms2048M -Xmx2048M -XX:+UseParallelGC -XX:NewRatio=2'
# JAVA_OPTIONS=

export CLASSPATH="$java_internal_class:$jar_path:$new_analyzer_path:$CLASSPATH"

alias runTest='java $JAVA_OPTIONS org.antlr.v4.gui.TestRig $grammar_class $start_rule'

# new custom class for future purposes
alias runAnalyze='java $JAVA_OPTIONS org.antlr.utils.Analyzer $grammar_class $start_rule'

alias antlr4='java $java_options org.antlr.v4.Tool'

make_grammar_with() {  
  local addon=$current_dir/$1
  echo "Creating grammar with addon: $addon"
  
  cat grammar/PlSql-template.g4 | sed -e '/<<PLACE_ADDON_HERE>>/ {' -e "r $addon" -e 'd' -e '}' > $grammar
}

### echo "Running! $1"
### grun $grammar $start_rule $*
