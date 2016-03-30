#!/bin/sh

###############################################################################
grammar=plsql
start_rule=sql_script
###############################################################################

#  [-tokens] [-tree] [-gui] [-trace]

antlr='antlr-4.5.2-complete.jar'

export CLASSPATH="./internal_class:./jars/$antlr:$CLASSPATH"
alias grun='java org.antlr.v4.gui.TestRig'
alias runTest='java org.antlr.v4.gui.TestRig $grammar $start_rule'
alias antlr4='java org.antlr.v4.Tool'

### echo "Running! $1"
### grun $grammar $start_rule $*
