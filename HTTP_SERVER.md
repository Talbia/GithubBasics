## Basic HTTP server

An HTTP server is software that understands `URLs (web addresses)` and `HTTP (the protocol your browser uses to view webpages)` . 

A HTTP or web server processes requests via HTTP, a network protocol used to exchange information on the _World Wide Web (www)_. The main function of a HTTP server is to `store, process and deliver web pages to clients.`

_It is a great module for `node.js`, we can use this module to run a webserver directly from our computer_

### Installation:

```ssh
sudo npm install http-server -g
```
- This will install http-server globally so that it may be run from the command line anywhere.

- When the installation is finished, we have to move to the folder where we have created the webpage to run. 

```ssh
ls -l
```
To check lists of all the files in the directory

> _In my case, I have the webpage in a folder on my desktop, so moving to desktop where my index dot HTML file is, OPTIONAL STEP_

```ssh
cd desktop
```
> _After going to the right folder, we run the webserver_

```ssh
http-server .
```
This dot indicates that the server should run in this folder.

#### Pressing Enter:
- copy the address in the port number
- open your browser
- paste the address with the port number

> For example`http://127.0.0.1:8080`

Now you're successfully running a webserver on your Mac.

#### To stop the server: 

- go back to the terminal, click the ctrl + C key simultaneously. 

