# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)


#Docker push -
mvn compile jib:build -Dimage=vinayakbagal7/consumer-service


#Docker build -
docker build -t vinayakbagal7/consumer-service .

#Docker container run
docker run --name consumer-service -d -p 8080:8080 --network consumer-mysql vinayakbagal7/consumer-service
docker run --name mysqldb --network consumer-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=sales -d mysql:8


#Get Docker container Logs
docker logs <container-id/name>

#List docker images
docker images

#List docker containers
docker ps
docker container ls

#Remove docker containers
docker rm <container-id/name>

#Remove docker images
docker stop <container-id/name>

docker rmi <image-id/name>

docker-compose pull
docker-compose up
docker-compose down
