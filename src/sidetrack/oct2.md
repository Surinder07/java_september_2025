## Recap 

Linux 



# path 
1. absolute path 
path from the root directory 

2. relative path 
a path realtive to your current working directory
  

cd ~ - takes to the home directory 
cd / - takes to the root directory
   /
    -  bin 
    - home 
      - Chetan
      - 


## File Permissions 

-rw-r--r--                      -      permissions 

r- read 
w - write 
x - execute

intellij.exe
intellij.dmg

d          - to represent a directory or a file [- file   and d for directoy]
rw-       - Owners permission 
r--       - group permissions  
r--       - other permissions

chmod 7 7 7 fileName

change permissions numbers 
0 -----> no 
1 - execute 
2 - write 
3 - write and execute 
4 - read 
5 - read and execute 
6 - read and write
7 - all permissions

chmod 100 file
                                Pragra[directory]
1. create a directory 





                Java.txt        Python.exe         Javascript.md 
Java.txt -owner permision - read and write , rest no permision 
Pyhton.exe -owner permision - read and write execute , rest read only
javscript  - all of them should have read only permission 



## Grep Command 
globally search for a regular expression

grep -v pattern file.txt

example

grep -v Node.js book.txt

## sort 

sort fileName

1. 
create a file, add some data and then search for the pattern 

## Shell scripting 

chmod +x fileName
 ./file_name.sh

## example 

#!/bin/bash
my_variable="Hello I am learning Java !"
echo "$my_variable"

## Problem statement

Hello My name is {name}, I am from {city}. 
I am currently learning {language}



#!/bin/bash
name="Chetan"
city=-"Brampton"
lang="Java"
echo "Hello My name is $name, I am from $city.
I am currently learning $lang"
~

























1                                   - 
sunny                               - owner 
staff                               - group       
0                                   - size of the file 
2 Oct 20:15                         - date time    
file2                               - fileName












   