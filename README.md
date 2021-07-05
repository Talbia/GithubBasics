# Github Basics


### After creating a new repository on the command line, commit some files:
echo “# Problems” >> README.md _optional_
-	git init
-	git add README.md 
> If you need a README markdown file
-   git commit -m “commit name”
-	git remote add origin “github repository link” i.e. https://github.com//Talbia/Problems.git/ ssh link
-	git push -u origin master `for master branch`

### For main branch _Mostly used - main branch_
- git init
- git add README.md (if readme.md needed) 
- git commit -m "first commit"
- git branch -M main
- git remote add origin git@github.com:Talbia/reactJS_login_authentication.git
- git push -u origin main `for main branch`

### Push a File in Github:
-	Open terminal
-	pwd
-	cd “ONESPACE”(as in a space) /Users/”username(for ex. john)”/Documents/workspace
-	ls 
-	git init
-	git add . 
-	git status 
-	git commit -m “commit” (whatever you like to name it)
-	Copy the URL file
-	git remote add origin “the URL file”
-	git push -u origin master 

> Then you might be asked for username and password for Github 


### Push an existing repository from the command line:
-	git remote add origin “github repository link” 
-	git push -u origin master


### Import code from another repository:

> You can initialize this repository with code from a Sebversion, Mercurial or TFS project.
> An option will be shown below “Import code”.


### (Practice) Used command lines for my personal repository:

- git clone git@github.com:Talbia/intro.git (clones/downloads the specific folder/repositories  from git to user’s desktop)

- open . (Opens the specific folder/directory as a pop up window)

- touch docker.md 
> create /modify/change a file using the touch command

- mv docker.md DOCKER.md 
> rename the docker.md file into DOCKER.md

- cat DOCKER.md 
> display everything/contents inside the DOCKER.md file

- git status 
> displays the state of the working directory

- git add DOCKER.md 
> adds a change in the working directory to the staging area

- git checkout -b addingDockerHelperFile 
> creating a new branch and switching to it at the same time, pushing commits to the addingDockerHelperFile branch

- git branch 
> displays the branch you’re in; i.e. main/master/others

- git commit -m "adding docker empty file" 
> commit command with a message

- git push origin addingDockerHelperFile 
> here addingDockerHelperFile is a branch, where the file is being pushed to instead of main/master

- git status

- git branch

- git checkout main 
> lets you navigate between the branches created by git branch, to start pushing commits to the new branch

- git log 
> displays all the number of commits in GitHub

- git branch -D addingDockerHelperFile 
> deleting the addingDockerHelperFile branch

- git branch 
> to check whether addingDockerHelperFile is deleted or not

- git push origin --delete addingDockerHelperFile

- history 
> displays all the git commands used so far

- git switch 
> switch to an existing branch



