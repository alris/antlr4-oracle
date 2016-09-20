#!/bin/sh
current_dir=$(dirname $0)

###############################################################################
# batch process array of files
###############################################################################
# $1 - path to files
# $2 - files mask
###############################################################################
files=($(find $1 -iname $2))
files_len=${#files[@]}
###############################################################################

batch_size=100

num_batches=$(( files_len / batch_size + 1))

echo "Files: $files_len, batches: $num_batches * $batch_size"

for (( i = 0; i < $num_batches; i++ )); do 
  f_from=$(( i * batch_size ))
  f_to=$(( f_from + batch_size - 1))

  echo "### $f_from - $f_to"
  ## !!!!!!!!!
  $current_dir/../analyze.sh ${files[@]:f_from:batch_size}
done


###############################################################################
# one by one (slow)
###############################################################################

# echo Files: $files_len

# i=0
# for file in ${files[@]}; do
  # i=$((i+1))
  # echo $i: $file
  # $current_dir/../analyze.sh $file
# done