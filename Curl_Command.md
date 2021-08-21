## Introduction to CURL 

-CURL stands for **Command line tool and library for transferring data with URLs**
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