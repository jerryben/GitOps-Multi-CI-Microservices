FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/order-service.jar .
CMD ["java", "-jar", "order-service.jar"]