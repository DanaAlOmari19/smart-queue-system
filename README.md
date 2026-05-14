# Smart Queue System

Spring Boot project for Advanced Software Engineering course.

## Features
- User API
- Booking API
- Queue API
- Notification API
- Location API
- Workflow API
- Simple Web Interface
- Docker Support

## Run Locally
cd user-service/user-service
.\mvnw.cmd spring-boot:run

Open:
http://localhost:8080

## Run With Docker
cd user-service/user-service
.\mvnw.cmd clean package -DskipTests
docker build -t smart-queue-user-service .
docker run --name smart-queue-container -p 8081:8080 smart-queue-user-service

Open:
http://localhost:8081
