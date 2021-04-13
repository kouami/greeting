FROM openjdk:8
EXPOSE 8090
ADD build/libs/greeting-0.0.1-snapshot.jar  greeting.jar
ENTRYPOINT ["java", "-jar", "/greeting.jar"]