FROM vinayakbagal7/consumer-service-base
WORKDIR /ConsumerService
COPY app/ .
RUN mvn clean install
ENTRYPOINT ["java", "-jar", "/ConsumerService/target/ConsumerService-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080