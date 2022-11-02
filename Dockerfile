FROM maven:3.5.4-jdk-8-alpine AS prebuild

COPY pom.xml pom.xml
COPY src/ src/

RUN mvn clean package


FROM openjdk:11 AS build

EXPOSE 8080


COPY --from=prebuild target/NumberOpsMS-0.0.1-SNAPSHOT.jar numberOps.jar

# ARG JARFILE=target/NumberOpsMS-0.0.1-SNAPSHOT.jar

# ADD ${JARFILE} numberOps.jar

ENTRYPOINT [ "java", "-jar", "numberOps.jar" ]