### Basic Documentation About Node.js and NPM

```ssh
Node.js
```

> Node.js® is a JavaScript-based environment use to create web-servers and networked applications. It is also used to perform helpful tasks on your computer such as concatenating and minifying JavaScript files and compiling Sass files into CSS.

```ssh
NPM (Node Package Manager)
```

> NPM is a “package manager” that makes installing Node “packages” fast and easy. NPM is installed when you install Node.js

_Although there is a Mac installer program on the Node website, using Homebrew to install and update Node lets you avoid possible security problems associated with using the `sudo` command to install Node._


#### Installing Node.js and NPM on Mac

```ssh
Installation Steps to Download Node
```
Open the Terminal app and type:

- a) `brew update` this updates Homebrew with the latest version of Node

- b) `brew install node`

Time to test it!

- a) `node -v` in terminal to see if node is installed
> This should print the version number something like v12.13.0

- b) `npm -v` in terminal to see if npm is installed
> This should print the version number something like 6.12.0

To Update Node and NPM:

- a) `brew update` in terminal to make sure Homebrew has the latest version of the Node package

- b) `brew upgrade node` in terminal to upgrade node

```ssh
To Uninstall Node
```
- `brew uninstall node` in terminal to uninstall packages