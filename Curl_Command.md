## Introduction to CURL 

- CURL stands for **Command line tool and library for transferring data with URLs**
- It's a tool for transferring data to and from a server and for making various types of requests. It's a great tool for testing RestAPIs.

### Commands: 

```sh
$ curl --help
```
> It will display all the different options that can be used with curl commands. 

- https://jsonplaceholder.typicode.com/posts
Using the above address, just grab the address and paste it in the terminal. 

```sh
$ curl https://jsonplaceholder.typicode.com/posts
```
> It shows all 100 posts available as a response. 

```sh
$ curl https://jsonplaceholder.typicode.com/posts/3
```
> It gives the post with the ID of 3. 

```sh
$ curl -i https://jsonplaceholder.typicode.com/posts/3
```
>It inclues all the header information - content type, the length, access control, cache etc. 

```sh
$ curl --head https://jsonplaceholder.typicode.com/posts/3
```
> To get the header. _Note: '-I' can be used instead of '--head' to get the header information only._

```sh
$ curl -o curlCmd.txt https://jsonplaceholder.typicode.com/posts
```
> Make the request, get all these posts (from 1-100) and put it into a txt or other file 

```sh
$ curl -O https://jsonplaceholder.typicode.com/posts
```
> To download file with curl with an Uppercase O

```ssh
$ curl -O https://jsonplaceholder.typicode.com/mockend.svg
```
> To download an image, **copy the image address/link (i.e. image address - mockend.svg) and paste it in the terminal after -O.**

```sh
$ curl --data "title=Hello & body=Hello World" https://jsonplaceholder.typicode.com/posts
```
> To post some quotes or title to be added as an ID for the posts part, type --data or -D and write the text inside the commas "" and copy the **POSTS ADDRESS**. _Note: It will add the title as the ID number 101 because 100 posts already stored there but it's not going to be saved or showed._

```sh
$ curl -X PUT -d "title=Hello" https://jsonplaceholder.typicode.com/posts/3
```
> To put the title in a specific Post ID e.g. ID no.3, type capital -X flag, **PUT** to be mentioned,--data command will be replaced with -d

```sh
$ curl -X DELETE https://jsonplaceholder.typicode.com/posts/3
```
> To delete a specific ID. A successful delete response. 

### Keypoints to remember:

- `$ curl http://address..` is used for the **GET request**. This is what an user get back for the get request. 

- `$ curl '--data or -d' "name=World&body=Hello World" https://address..` is used for the **POST request**. This is how an user can pass in post data and follow that by the URL that the user's requesting. 

- `$ curl '-verbose' http://address` This verbose flag used to see what the User is requesting for (i.e. get/post/put). **Here, -v can be used instead of veerbose, -v is the short form of verbose**

- $ curl '-X' is used for **PUT and DELETE** requests.
