# Clothing Store API

Spring Boot REST API for managing clothing products. Developed as part of an assignment.

## Developer

Ayub Hazzi

## Features

- CRUD operations for `Product`
- RESTful API using Spring Boot
- Input validation with Jakarta Validation
- API documentation using Swagger UI
- Layered architecture (Controller, Service, Repository, Model)

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Swagger / OpenAPI
- Maven

## How to Run

1. Clone the repo  
   `git clone https://github.com/Ayubhazzi/clothingstore.git`

2. Navigate to the project folder  
   `cd clothingstore`

3. Build the project  
   `./mvnw clean install`

4. Run the application  
   `./mvnw spring-boot:run`

5. Open Swagger UI in your browser:  
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## API Endpoints

| Method | Endpoint                                | Description              |
|--------|-----------------------------------------|--------------------------|
| GET    | `/api/products`                         | Get all products         |
| POST   | `/api/products`                         | Create a new product     |
| GET    | `/api/products/{id}`                    | Get product by ID        |
| DELETE | `/api/products/{id}`                    | Delete product by ID     |
| GET    | `/api/products/category/{category}`     | Get products by category |



