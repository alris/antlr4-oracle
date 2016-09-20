#!/bin/sh
current_dir=$(dirname $0)

###############################################################################
source $current_dir/common.sh
###############################################################################

#  [-tokens] [-tree] [-gui] [-trace]

echo "# Running: $*"
runTest $*
#runAnalyze $*
