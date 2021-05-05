# GithubBasics

Basic Terminal Commands for macOS 
1. pwd : to find out the path of the current working directory (folder)

2. cd : to navigate through the files and directories
•	cd .. (with two dots) to move one directory up
•	cd to go straight to the home folder
•	cd- (with a hyphen) to move to your previous directory
3. ls : used to view the contents of a directory
•	ls -R will list all the files in the sub-directories as well
•	ls -a will show the hidden files
•	ls -al will list the files and directories with detailed information like the permissions, size, owner, etc.
•	ls –l will list the files and directories with detailed information like the date, time, folder name etc.
4. cat : (short for concatenate) used to list the contents of a file on the standard output (sdout)
•	cat > filename creates a new file
•	cat filename1 filename2>filename3 joins two files (1 and 2) and stores the output of them in a new file (3)
•	to convert a file to upper or lower case use, cat filename | tr a-z A-Z >output.txt
5. cp : to copy files from the current directory to a different directory
For instance, the command cp scenery.jpg /home/username/Pictures would create a copy of scenery.jpg (from your current directory) into the Pictures directory.

6. mv : to move files, although it can also be used to rename files.
For example: mv file.txt /home/username/Documents.
To rename files, the Linux command is mv oldname.ext newname.ext
7. mkdir : to make a new directory

8. rmdir : to delete a directory. rmdir only allows you to delete empty directories.

9. rm : used to delete directories and the contents within them. If you only want to delete the directory — as an alternative to rmdir — use rm -r.

10. touch : to create a blank new file through the Linux command line. As an example, enter touch /home/username/Documents/Web.html to create an HTML file entitled Web under the Documents directory.

11. echo : used to move some data into a file
12. 

 


Basic Git Commands
1. git config --global user.name "Sam Smith"
git config --global user.email sam@example.com
- Configure the author name and email address to be used with your commits. (Tell git who you are)
2. git init 
- Create a new local repository
3. git clone /path/to/repository
- Create a working copy of a local repository (Check out a new repository)
4. git clone username@host:/path/to/repository
- For a remote server, use
5. git add <filename>
git add *
- Add one or more files (Add files)
6. git commit –m “commit message/name”
7. git commit –a 
- Commit any files you’ve added with git add, and also commit any files you’ve changed since then
8. git push origin master
- Send changes to the master branch of your repository
9. git status
- List the files you’ve changed and those you need to add or commit
10. git remote add origin <server>
- Add the server to be able to push it when you haven’t connected the local repository to a server
11. git remote –v
- List all currently configured remote repositories 
12. git pull
- Fetch and merge changes on the remote server to the working directory.
13. git merge <branchname>
- Merge a different branch into the active branch.

Create a new repository on the command line
echo “# Problems” >> README.md
1.	git init
2.	git add README.md
3.	git commit -m “commit name”
4.	git remote add origin “github repository link” i.e. https://github.com//Talbia/Problems.git
5.	git push -u origin master

Push a File in Github -
1.	Open terminal
2.	pwd
3.	cd “ONESPACE”(as in a space) /Users/”username(for ex. john)”/Documents/workspace
4.	ls 
5.	git init
6.	git add . 
7.	git status 
8.	git commit -m “commit” (whatever you like to name it)
9.	Copy the URL file
10.	git remote add origin “the URL file”
11.	git push -u origin master 

Then you might be asked for username and password for Github 


Push an existing repository from the command line
1.	git remote add origin “github repository link” 
2.	git push -u origin master

Import code from another repository
You can initialize this repository with code from a Sebversion, Mercurial or TFS project.
An option will be shown below “Import code”.


SBT: 
SBT is an open-source build tool for Scala and Java projects, similar to Apache’s Maven. It is the interactive build tool for Scala, Java and many more. This shell has a command prompt. 
For example, you could type compile at the sbt shell: > compile. To compile again, press up arrow and then enter. To run your program, type run . To leave sbt shell, type exit or use Ctrl+D (Unix) or Ctrl+Z (Windows).

