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

Create Docker image
Command to create docker image using Google JIB plugin

./mvnw com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/spring-boot-example:v1

Run the Docker image
Command to run the docker image which we created in the previous step

docker run -ti --rm -p 8080:8080 gcr.io/$GOOGLE_CLOUD_PROJECT/spring-boot-example:v1

Login to the K8s Cluster
Command to login to the K8s cluster from Cloud Shell

gcloud container clusters get-credentials techprimer-cluster-1 --zone us-central1-a

Kubernetes Commands
List Pods
kubectl get pods

List Deployments
kubectl get deployments

List Services
kubectl get services

Deploy an image
kubectl run spring-boot-example --image=gcr.io/$GOOGLE_CLOUD_PROJECT/spring-boot-example:v1 --port=8080

Expose Load Balancer
kubectl expose deployment spring-boot-example --type=LoadBalancer

Scale deployments
kubectl scale deployment spring-boot-example --replicas=3
