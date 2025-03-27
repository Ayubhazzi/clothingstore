# Clothing Store API

Et enkelt REST API for å håndtere produkter i en klesbutikk, utviklet med Spring Boot.

## Funksjonalitet

API-et støtter følgende operasjoner:

- `GET /api/products` – Hent alle produkter
- `GET /api/products/{id}` – Hent et produkt med ID
- `GET /api/products/category/{category}` – Hent produkter med spesifikk kategori
- `POST /api/products` – Opprett nytt produkt
- `DELETE /api/products/{id}` – Slett et produkt

## Teknologi

- Java 17
- Spring Boot
- JPA (Hibernate)
- H2 Database (i minne)
- Springdoc / Swagger UI for dokumentasjon

## Kom i gang

### Kloning og oppsett

```bash
git clone https://github.com/[ditt-brukernavn]/clothingstore.git
cd clothingstore
./mvnw clean install
./mvnw spring-boot:run
