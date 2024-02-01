From openjdk:11
RUN mkdir /app
WORKDIR /app
COPY target/AssignmentDevops-0.0.1-SNAPSHOT.jar /app
EXPOSE 8899
ENTRYPOINT ["java", "-jar", "AssignmentDevops-0.0.1-SNAPSHOT.jar"]
