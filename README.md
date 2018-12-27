# Micro streaming analytics

Springboot application which goal is reading JSON messages from a RabbitMQ queue. By collecting info from queue, several statistical calculations will be done. Those results will be persisted in MongoDB data base.

Every time RabbitMQ receive a new JSON message in "devicesqueue" queue, a Rabbit Listener collect that message and persist it in a MongoDB collection named "deviceDto". At the same time, app makes a query to MongoDB in order to get all messages which deviceId match with message received from RabbitMQ. After this query, app computes statistics and persist them in another collection named "deviceStats".

You can test the functionality forcing message sending with endpoint /sendJsonToRabbit, or even you can ask for statistics on demand through endpoint //computeStatistics/{deviceId}

# Running application with Docker

You can run this application with Docker. Do not forget you must have Docker installed before. Try run:
$ mvn package docker:build

then you can confirm that docker images has been created by running:
$ docker images

our docker images name is springdocker as we defined in pom.xml
Finally run:
$ docker run -it -p 9999:8080 springdocker

In fact, you could run RabbitMQ application and MongoDB database due to docker-compose.yml file also present in this project, just run, in the root directory:
$ docker-compose up -d



