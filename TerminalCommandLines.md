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


#### - list (ls)
- ls 
> It is used to view the contents of a directory
- ls -R 
> It will list all the files in the sub-directories as well
- ls -a 
> It will show the hidden files
- ls -al 
> It will list the files and directories with detailed information like the permissions, size, owner, etc.
- ls –l 
> Itwill list the files and directories with detailed information like the date, time, folder name etc.

#### - Concatenate (cat)
- cat 
> (short for concatenate) used to list the contents of a file on the standard output (sdout)
- cat > filename 
> It creates a new file
- cat filename1 filename2>filename3 
> It joins two files (1 and 2) and stores the output of them in a new file (3)
to convert a file to upper or lower case use, cat filename | tr a-z A-Z >output.txt

- cp 
> to copy files from the current directory to a different directory
For instance, the command cp scenery.jpg /home/username/Pictures would create a copy of scenery.jpg (from your current directory) into the Pictures directory.

- mv 
> to move files, although it can also be used to rename files.
For example: mv file.txt /home/username/Documents.
To rename files, the Linux command is mv oldname.ext newname.ext

- mkdir 
> to make a new directory

- rmdir 
> to delete a directory. rmdir only allows you to delete empty directories.

- rm 
> used to delete directories and the contents within them. If you only want to delete the directory — as an alternative to rmdir — use rm -r.

- touch 
> to create a blank new file through the Linux command line. As an example, enter touch /home/username/Documents/Web.html to create an HTML file entitled Web under the Documents directory.

> touch filename with extension (touch README.md)


- echo 
> used to move some data into a file