FROM openjdk:11

EXPOSE 8080

ARG JARFILE=target/NumberOpsMS-0.0.1-SNAPSHOT.jar

ADD ${JARFILE} numberOps.jar

ENTRYPOINT [ "java", "-jar", "numberOps.jar" ]