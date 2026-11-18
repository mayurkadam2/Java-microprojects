## Array Statistics 

The class variables are initialized automatically even if are not assign any value to them, but the local variables are not initialized automatically we have to initialize them.

after the project work is increasing I need to clone the single subfolder to my local system and work on that but the commit and everything looks difficult to solve that problem it is sparse checkout I am going to learn that in next few projects.

Java only allows:

Fields (instance variables)
Constructors
Methods
Static blocks
Inner classes

directly inside a class.

so we can not put statements directly inside any class.

## Temperature converter.
In this program I learned hub to all network architecture.
It helped me to write less methods for all type of the conversion.
I just standardised the temperatures to kelving no matter which unit we get convet it to kelvin,
and from kelvin convert it to all other methods.

Dependency injection of the scanner object so it will be used and closed in the main itself

I learned build a method that should serve single purpose not many work at once, I used one method to get input, unit validation, and conversion, Instead of that I should have to make methods that serve a specific purpose so they will less independent on each other
I learned that in SE less cohesion high ..

because all temperatures are convetible to kelving so why not there is a method that accept the unit and value so it can be used.

we can solve this step by step hirachy of the validations.

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