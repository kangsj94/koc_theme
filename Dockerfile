FROM eclipse-temurin:17.0.6_10-jdk-focal
CMD []
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} theme-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "theme-0.0.1-SNAPSHOT.jar"]