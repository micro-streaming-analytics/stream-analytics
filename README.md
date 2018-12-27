# Micro streaming analytics

Springboot application which goal is reading JSON messages from a RabbitMQ queue. By collecting info from queue several statistical calculations will be done. Those results will be persisted in MongoDB data base.

You can run this application with Docker. Do not forget you must have Docker installed before. Try run:
$ mvn package docker:build

then you can confirm that docker images has been created by running:
$ docker images

our docker images name is springdocker as we defined in pom.xml
Finally run:
$ docker run -it -p 9999:8080 springdocker

In fact, you could run RabbitMQ application and MongoDB database due to docker-compose.yml file also present in this project, just run, in the root directory:
$ docker-compose up -d



