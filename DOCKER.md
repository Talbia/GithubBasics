## DOCKER Basics

## Here are some basic command lines are used for Docker Container

### After Docker installation, type on terminal
### Mostly Used Docker Commands

- docker version 
--This command is used to get the currently installed version of docker

- docker info 
-- This command displays all informations about docker

- docker run hello-world (No images will be found locally)
-- It will find images from docker hub and display “Hello from Docker”. (This message shows that your installation appears to be working correctly.)

- docker images
-- This command displays all the images created

- docker ps 
-- This command is used to see the list of all running containers

- docker pull
docker pull <image name>
-- This command is used to pull images from the docker repository(hub.docker.com)

- docker run
docker run -it -d <image name>
-- This command is used to create a container from an image

- docker ps
-- This command is used to list the running containers

- docker ps -a
-- This command is used to show all the running and exited containers

- docker exec
docker exec -it <container id> bash
-- This command is used to access the running container

- docker stop
docker stop <container id>
-- This command stops a running container

- docker kill
docker kill <container id>
-- This command kills the container by stopping its execution immediately. 

```sh
The difference between ‘docker kill’ and ‘docker stop’ is that ‘docker stop’ gives the container time to shutdown gracefully, in situations when it is taking too much time for getting the container to stop, one can opt to kill it..

```

- docker commit
docker commit <conatainer id> <username/imagename>
-- This command creates a new image of an edited container on the local system

- docker login
-- This command is used to login to the docker hub repository

- docker push
docker push <username/image name>
-- This command is used to push an image to the docker hub repository

- docker images
-- This command lists all the locally stored docker images

- docker rm
docker rm <container id>
-- This command is used to delete a stopped container

- docker rmi
docker rmi <image-id>
-- This command is used to delete an image from local storage

- docker build
docker build <path to docker file>
-- This command is used to build an image from a specified docker file




