#!/bin/sh

###############################################################################
source ./common.sh
###############################################################################

###############################################################################
# batch process array
###############################################################################
# $1 - path to files
# $2 - files mask
files=($(find $1 -iname $2))

batch_size=100

files_len=${#files[@]}
num_batches=$(( files_len / batch_size + 1))

echo "Files: $files_len, batches: $num_batches * $batch_size"

for (( i = 0; i < $num_batches; i++ )); do 
  f_from=$(( i * batch_size ))
  f_to=$(( f_from + batch_size - 1))

  echo "### $f_from - $f_to"
  runTest ${files[@]:f_from:batch_size}
  # runAnalyze ${files[@]:f_from:batch_size}
done


###############################################################################
# one by one (slow)
###############################################################################
# files=($(find $ARGUS/../db/src -iname "*.pkb"))
# files_len=${#files[@]}

# echo Files: $files_len

# i=0
# for file in ${files[@]}; do
  # i=$((i+1))
  # echo $i: $file
  # runTest $file
# done