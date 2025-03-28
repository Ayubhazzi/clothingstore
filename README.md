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

git add README.md
git commit -m "Oppdatert README med API-dokumentasjon"
git push
API Endpoints
GET /api/products
Henter alle produkter
Eksempel statuskode: 200 OK

POST /api/products
Oppretter et nytt produkt
Eksempel statuskoder: 201 Created, 400 Bad Request

GET /api/products/{id}
Henter produkt basert på ID
Eksempel statuskoder: 200 OK, 404 Not Found

DELETE /api/products/{id}
Sletter produkt basert på ID
Eksempel statuskoder: 204 No Content, 404 Not Found

GET /api/products/category/{category}
Henter produkter basert på kategori
Eksempel statuskoder: 200 OK, 404 Not Found

Eksempel på request (POST /api/products)
json
Kopier
Rediger
{
  "name": "T-shirt",
  "category": "Menswear",
  "price": 249.99
}
Eksempel på response (200 OK)
json
Kopier
Rediger
{
  "id": 1,
  "name": "T-shirt",
  "category": "Menswear",
  "price": 249.99
}
Valideringsregler
name: Påkrevd, kan ikke være tom

category: Valgfri

price: Valgfri, må være et tall