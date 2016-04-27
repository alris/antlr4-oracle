#!/bin/sh

###############################################################################
antlr='antlr-4.5.2-complete.jar'
###############################################################################
grammar=PlSql.g4
start_rule=sql_script
grammar_class=org.antlr.generated.PlSql
###############################################################################
src_path=./src/Antlr4ParserLexer/src/org/antlr/generated
jar_path=./src/Antlr4ParserLexer/lib/$antlr
###############################################################################

#  [-tokens] [-tree] [-gui] [-trace]

# java_options='-client -Xms100m -Xmx100m'
java_options=

export CLASSPATH="./internal_class:$jar_path:$CLASSPATH"
#alias grun='java $java_options org.antlr.v4.gui.TestRig'
alias runTest='java $java_options org.antlr.v4.gui.TestRig $grammar_class $start_rule'
alias antlr4='java $java_options org.antlr.v4.Tool'

### echo "Running! $1"
### grun $grammar $start_rule $*
