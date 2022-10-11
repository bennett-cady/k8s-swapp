FROM openjdk:11

EXPOSE 8080

RUN mvn clean package

ARG JARFILE = target/NumberOpsMS-0.0.1-SNAPSHOT.jar

ADD ${JARFILE} numberOps.jar

ENTRYPOINT [ "java", "-jar", "numberOps.jar"]