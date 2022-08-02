#building
FROM maven:3.8.4-openjdk AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml -DskipTests=true  package
#packing
FROM openjdk:11-jre-slim
COPY --from=build home/app/target/ReturnOrderManagementSystem-CloudConfig-0.0.1-SNAPSHOT.jar /home/app/ReturnOrderManagementSystem-CloudConfig.jar 
WORKDIR /home/app
EXPOSE 9999
ENTRYPOINT java -jar ReturnOrderManagementSystem-CloudConfig.jar