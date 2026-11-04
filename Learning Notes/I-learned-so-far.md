## Number Guessing game
Used Random class to generate random number in a scale

When VS code shows error even if all the class names are correct placement of classes is perfect still it shows error
we can refresh it ``` ctrl + shift + p ``` search for Java: Clean Java Language Server Workspace

making scanner object private
    using multiple scanner on input stream is generally discouraged
    changing the reference of scanner object is not a good idea

instead of directly hardcoding values in the conditionals used final private variables

Handled InputMismatchException while consuming the leftover in the input stream.


## Calculator
I learned to create a mono repo for the project to maintain all the projects in a single repository wihtout creating a mess directly on the github's main repository

- learned 
``` 
    git rm -r --cached
```
This command marks all files recusively in a directory as deleted.
I used this commad because I accidently added the .class files to the remote, to avoid that used this command and added a .gitigonre file then made a new commit this time git scanned for all files excet .class files and staged them to push only useful files.

** Git Diverged branches Issue **
I got git diverted repo issue where I have made changes directly on github and my also made changes on my local repository so my repository is one commit behind, suppose
remote: A-B-C
local: A-B-X
to solve this issue rebase helped me
       C  (remote)
      /
A --- B
      \
       X  (local)

A --- B --- C --- X

steps

fetching the remote
```
    git fetch origin
```

rebase local branch
```
    git rebase origin/main
```
it puts our all new local commits in front of all of the remote, but for our commits we get a different commit id


if the remote c and local x have edited the same file then there will be some conflict, resolve them
```
    git add .
    git rebase --continue
```

pushing my changes
```
    git push origin main
```


- error handling
I handled divide by zero method at the time of accepting elements in the switch case, although there may be another way to handle divide by zero erro.
I handled the InputMismatchException at the time of accepting the inputs inside the try catch block.

additionally closed all the resources.