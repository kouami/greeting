FROM openjdk:8
EXPOSE 8090
ADD build/libs/greeting-0.0.1-SNAPSHOT.jar  greeting-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/greeting-0.0.1-SNAPSHOT.jar"]