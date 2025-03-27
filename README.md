# Clothing Store API

Spring Boot REST API for managing clothing products. Developed as part of an assignment.

## Developer
Ayub Hazzi

## Features
- CRUD operations for Product
- Category support for filtering
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

1. **Clone the repo**
```bash
git clone https://github.com/Ayubhazzi/clothingstore.git

## API Endpoints

Disse er de tilgjengelige REST-endpunktene i prosjektet:

- `GET /api/products` – Henter alle produkter
- `POST /api/products` – Oppretter et nytt produkt
- `GET /api/products/{id}` – Henter produkt med gitt ID
- `DELETE /api/products/{id}` – Sletter produkt med gitt ID
- `GET /api/products/category/{category}` – Henter produkter etter kategori
