### Basic Git Commands

- git config --global user.name "Sam Smith"

- git config --global user.email sam@example.com
> Configure the author name and email address to be used with your commits. (Tell git who you are)

- git init 
> Create a new local repository

- git clone /path/to/repository
> Create a working copy of a local repository (Check out a new repository)

- git clone username@host:/path/to/repository
> For a remote server, use

- git add <filename>

- git add *
> Add one or more files (Add files)

- git commit –m “commit message/name”
> message will always be inside a pair of commas

- git commit –a 
> Commit any files you’ve added with git add, and also commit any files you’ve changed since then

- git push origin master
> Send changes to the master branch of your repository

- git status
> List the files you’ve changed and those you need to add or commit

- git remote add origin <server>
> Add the server to be able to push it when you haven’t connected the local repository to a server

- git remote –v
> List all currently configured remote repositories 

- git pull
> Fetch and merge changes on the remote server to the working directory.

- git merge <branchname>
> Merge a different branch into the active branch.