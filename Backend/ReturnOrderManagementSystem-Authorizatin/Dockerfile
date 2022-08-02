#building
FROM maven:3.8.4-openjdk AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml -DskipTests=true  package
#packaging
FROM openjdk:11-jre-slim
COPY --from=build home/app/target/ReturnOrderManagementSystem-Authorization-0.0.1-SNAPSHOT.jar /home/app/ReturnOrderManagementSystem-Authorization.jar
EXPOSE 9094
ENTRYPOINT java -jar /home/app/ReturnOrderManagementSystem-Authorization.jar
