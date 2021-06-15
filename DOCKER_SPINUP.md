## Easily Spin Up a Docker Container

```ssh
1. In this markdown file, I'm preparing a VM to run as a Docker host and demonstrating 
how to pull a Nginx Docker image from Docker Hub to create a container based off of the Nginx image.

2. After pulling down the Nginx Docker image, creating a Docker container from the Docker image 
and confirming that the container is up and running.
```
#### Open the terminal - Spin Up Procedures
_NOTE: if you get a message saying that "permission denied", make sure to type sudo at first then rest of the commands._
- Pull Image
```sh
docker pull nginx:latest
```
> docker pull is way to pull down docker images from docker hub. In this case, you'll pull down latest nginx image.

- Check image list
```sh
docker image ls
```
> Latest nginx image created and displayed in the container list

- Run the Docker Container
```sh
docker run -t -d -p 80:80 nginx:latest /bin/bash
```
> 1. Docker run spins up a container at first. 
> 2. The -t switch is a pseudo TTY console that send the output to the virtual tty (bash/terminal) within this docker container.
> 3. The -d switch is used to detouch 
> 4. The -p switch specifies port 80:80 - where the first 80 is for what and how nginx service can be accessed, and the second 80 is for the internal docker now working to which portal 
> 5. Specify the image name "nginx:latest"
> 6. Specify how container should run, for example "/bin/bash"

```sh
docker container ls
```

- To run a docker to get exec (execution) to the container

```sh 
docker exec -ti 7a6f6591e2bf
```
> The -ti switch is used for TTY console and console to be interactive and use the container_id

- Official Spin Up

```sh
docker exec -ti 7a6f6591e2bf /bin/bash
```
> To spin up, /bin/bash to be used to officially get inside of the container. 


- Run nginx

```sh 
service nginx start
service nginx status
```
> To check whether nginx is running out of the container or not. 
> Use exit command to get back to the original server

- Verify
```sh
docker container ls
```
> You can see the container running (Check the status timing!)
