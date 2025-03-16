FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./mvnw package -DskipTests
EXPOSE 9966
CMD ["java", "-jar", "target/system-rest-1.0.0.jar"]