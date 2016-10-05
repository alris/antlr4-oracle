#!/bin/bash

files=(plsql_keywords.txt  plsql_reserved_words.txt  sql_reserved_words.txt)

for file in ${files[@]}; do
  while read line
  do
    word=${line//\n//}
    spaced_word=$(printf $word | sed -e 's/\(.\)/\1 /g')
    
    let spaces_length=29-${#word}
    
    printf "%s:%$spaces_length.s%s;\n" $word "" "$spaced_word"
  done < $file
done
