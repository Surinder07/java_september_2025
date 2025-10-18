## Recap 

1. git/github

init
Git commands

what is a commit ? 


start a working area (see also: git help tutorial)
clone      Clone a repository into a new directory
init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
add        Add file contents to the index
mv         Move or rename a file, a directory, or a symlink
restore    Restore working tree files
rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
[bisect]     Use binary search to find the commit that introduced a bug
diff       Show changes between commits, commit and working tree, etc
grep       Print lines matching a pattern
log        Show commit logs
show       Show various types of objects
status     Show the working tree status

grow, mark and tweak your common history
backfill   Download missing objects in a partial clone
branch     List, create, or delete branches
commit     Record changes to the repository
merge      Join two or more development histories together
rebase     Reapply commits on top of another base tip
reset      Reset current HEAD to the specified state
switch     Switch branches
tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
fetch      Download objects and refs from another repository
pull       Fetch from and integrate with another repository or a local branch
push       Update remote refs along with associated objects

## Branch

branch is a pointer to the commit


master - original copy                                                          
|
featureBranch

Production  www.amazon.com
Staging     www.stag.amazon.com
QA / develop www.dev.amazon.com
Local env

## Staging


## branches
1. git branch branchName - to check the current branch
2. git checkout branchName - to switch to another branch
3. git checkout -b branchName - to create and switch to another branch
4. git branch -D test - to delete the branch 



