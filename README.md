# Github Basics

### Basic Terminal Command lines for macOS 

- pwd : to find out the path of the current working directory (folder)

#### - Changing Directory (cd)
- cd directory name
> to navigate through the files and directories
- cd .. 
> (with two dots) to move one directory up
- cd ~
> to go straight to the home directory
-  cd - 
> (with a hyphen) to move to your previous directory


- list (ls)
-- ls : used to view the contents of a directory
--	ls -R will list all the files in the sub-directories as well
--	ls -a will show the hidden files
--	ls -al will list the files and directories with detailed information like the permissions, size, owner, etc.
--	ls –l will list the files and directories with detailed information like the date, time, folder name etc.

- Concatenate (cat)
- cat : (short for concatenate) used to list the contents of a file on the standard output (sdout)
--	cat > filename creates a new file
--	cat filename1 filename2>filename3 joins two files (1 and 2) and stores the output of them in a new file (3)
--	to convert a file to upper or lower case use, cat filename | tr a-z A-Z >output.txt

- cp : to copy files from the current directory to a different directory
For instance, the command cp scenery.jpg /home/username/Pictures would create a copy of scenery.jpg (from your current directory) into the Pictures directory.

- mv : to move files, although it can also be used to rename files.
For example: mv file.txt /home/username/Documents.
To rename files, the Linux command is mv oldname.ext newname.ext

- mkdir : to make a new directory

- rmdir : to delete a directory. rmdir only allows you to delete empty directories.

- rm : used to delete directories and the contents within them. If you only want to delete the directory — as an alternative to rmdir — use rm -r.

- touch : to create a blank new file through the Linux command line. As an example, enter touch /home/username/Documents/Web.html to create an HTML file entitled Web under the Documents directory.
-- touch filename with extension (touch README.md)


- echo : used to move some data into a file



### Basic Git Commands

- git config --global user.name "Sam Smith"

- git config --global user.email sam@example.com
-- Configure the author name and email address to be used with your commits. (Tell git who you are)

- git init 
-- Create a new local repository

- git clone /path/to/repository
-- Create a working copy of a local repository (Check out a new repository)

- git clone username@host:/path/to/repository
-- For a remote server, use

- git add <filename>

- git add *
-- Add one or more files (Add files)

- git commit –m “commit message/name”

- git commit –a 
-- Commit any files you’ve added with git add, and also commit any files you’ve changed since then

- git push origin master
-- Send changes to the master branch of your repository

- git status
-- List the files you’ve changed and those you need to add or commit

- git remote add origin <server>
-- Add the server to be able to push it when you haven’t connected the local repository to a server

- git remote –v
-- List all currently configured remote repositories 

- git pull
-- Fetch and merge changes on the remote server to the working directory.

- git merge <branchname>
-- Merge a different branch into the active branch.

##### Create a new repository on the command line
echo “# Problems” >> README.md
-	git init
-	git add README.md
-   git commit -m “commit name”
-	git remote add origin “github repository link” i.e. https://github.com//Talbia/Problems.git
-	git push -u origin master

##### Push a File in Github -
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

Then you might be asked for username and password for Github 


##### Push an existing repository from the command line
-	git remote add origin “github repository link” 
-	git push -u origin master

##### Import code from another repository
You can initialize this repository with code from a Sebversion, Mercurial or TFS project.
An option will be shown below “Import code”.


##### (Practice) Used command lines for my personal repository

- git clone git@github.com:Talbia/intro.git (clones/downloads the specific folder/repositories  from git to user’s desktop)

- open . (Opens the specific folder/directory as a pop up window)

- touch docker.md (create /modify/change a file using the touch command)
- mv docker.md DOCKER.md (rename the docker.md file into DOCKER.md)
- cat DOCKER.md (display everything/contents inside the DOCKER.md file)
- git status (displays the state of the working directory)
- git add DOCKER.md (adds a change in the working directory to the staging area)
- git checkout -b addingDockerHelperFile (creating a new branch and switching to it at the same time, pushing commits to the addingDockerHelperFile branch)
- git branch (displays the branch you’re in; i.e. main/master/others)
- git commit -m "adding docker empty file" (commit command with a message)
- git push origin addingDockerHelperFile (here addingDockerHelperFile is a branch, where the file is being pushed to instead of main/master)
-git status
- git branch
- git checkout main (lets you navigate between the branches created by git branch, to start pushing commits to the new branch)
- git log (displays all the number of commits in GitHub)
- git branch -D addingDockerHelperFile (deleting the addingDockerHelperFile branch)
- git branch (to check whether addingDockerHelperFile is deleted or not)
- git push origin --delete addingDockerHelperFile
- history (displays all the git commands used so far)
- git switch (switch to an existing branch)


### SBT: 
SBT is an open-source build tool for Scala and Java projects, similar to Apache’s Maven. It is the interactive build tool for Scala, Java and many more. This shell has a command prompt. 
For example, you could type compile at the sbt shell: > compile. To compile again, press up arrow and then enter. To run your program, type run . To leave sbt shell, type exit or use Ctrl+D (Unix) or Ctrl+Z (Windows).
 
##### To setup Sbt using brew on Mac: 

- Open the terminal

- Type ~ brew search sbt (It will show you the whole list of sbt)

- Two formula will be displayed in the terminal sbt and sbt@0.13 (To install the older version, you can select sbt@0.13 and for newer and updated version, you should choose sbt)

- Type ~ brew info sbt (It will show you the detail informations)

Meanwhile, you may need to install Java OpenJDK on macOS; for that
- a) Open a browser, write adoptopenjdk.net and choose a version (OpenJDK 11 LTS, Hotspot as a JVM). After downloading the package file, extract it and install it 

- b) Open the terminal, type java -version (To see OpenJDK version)

- c) type java -version (To see javac version)

- d) Search for OpenJDK on a browser, click on ‘install’ and click on ‘jdk.java.net/13’ or as required and choose macOS version x64 

- e)A package file will be downloaded. Then extract it and check the java -version by typing it again. 

- Type ~ brew install sbt (Downloading process will continue)

- Type ~ sbt sbtVersion (To check sbt version)

