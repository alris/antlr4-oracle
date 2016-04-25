#!/bin/sh

###############################################################################
grammar=PlSql.g4
grammar_class=org.antlr.generated.PlSql
start_rule=sql_script
###############################################################################

#  [-tokens] [-tree] [-gui] [-trace]

antlr='antlr-4.5.2-complete.jar'
# java_options='-client -Xms100m -Xmx100m'
java_options=

export CLASSPATH="./internal_class:./jars/$antlr:$CLASSPATH"
#alias grun='java $java_options org.antlr.v4.gui.TestRig'
alias runTest='java $java_options org.antlr.v4.gui.TestRig $grammar_class $start_rule'
alias antlr4='java $java_options org.antlr.v4.Tool'

### echo "Running! $1"
### grun $grammar $start_rule $*
