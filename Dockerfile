FROM openjdk:16
WORKDIR /app
ADD target/auth-service.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","auth-service.jar"]