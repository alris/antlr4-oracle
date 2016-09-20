#!/bin/sh
current_dir=$(dirname $0)

###############################################################################
antlr='antlr-4.5.2-complete.jar'
###############################################################################

grammar=PlSql.g4
start_rule=sql_script

grammar_class=org.antlr.generated.PlSql

###############################################################################

src_path=$current_dir/src/Antlr4ParserLexer/src/org/antlr/generated
jar_path=$current_dir/src/Antlr4ParserLexer/lib/$antlr

new_analyzer_path=$current_dir/bin/analyzer.jar

###############################################################################

#  [-tokens] [-tree] [-gui] [-trace]

export CLASSPATH="$current_dir/internal_class:$jar_path:$new_analyzer_path:$CLASSPATH"

alias runTest='java org.antlr.v4.gui.TestRig $grammar_class $start_rule'

# new custom class for future purposes
alias runAnalyze='java org.antlr.utils.Analyzer $grammar_class $start_rule'

alias antlr4='java $java_options org.antlr.v4.Tool'

### echo "Running! $1"
### grun $grammar $start_rule $*
