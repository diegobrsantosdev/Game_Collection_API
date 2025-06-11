# 🎮 DSList – Game Collection API

This is a backend RESTful API developed with **Java Spring Boot** and **PostgreSQL** for managing a personal collection of video games. It allows organizing games into custom lists, retrieving them in a defined order, and interacting with all data using HTTP requests.

---

## 📦 Features

- List all registered games with summary or full details
- Organize games into custom **game lists**
- Move games within a list (change position/order)
- Retrieve games by list, ID, or order
- Data transfer objects (DTOs) for efficient response formatting
- Fully RESTful API using Spring Boot conventions
- Tested using Postman

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- ModelMapper
- Lombok
- Postman

---

## 🗃️ Database Structure

**Entities:**

- `Game`: represents a game (title, genre, year, platform, etc.)
- `GameList`: custom list of games (e.g., "My Favorites", "To Play")
- Relation: `Game` ↔ `GameList` via linking table `belonging`

Game
│
├── GameList
│   └── Position (ordering field in the join table)
The project uses native SQL for optimized ordering logic.

📫 API Endpoints (Examples)
Method	Endpoint	Description
GET	/games	Get all games (basic info)
GET	/games/{id}	Get full details of a game
GET	/lists	Get all game lists
GET	/lists/{listId}/games	Get games from a specific list
POST	/lists/{listId}/replace	Change the position of a game in list

________________________________________

🧪 Postman Integration
All routes have been tested using Postman
The API supports common operations and uses meaningful HTTP responses
You can import Postman collections or use curl to test endpoints
________________________________________

▶️ Running the Project Locally
Clone the repository:
git clone https://github.com/SEU_USUARIO/dslist.git
cd dslist

Create the database in PostgreSQL:
CREATE DATABASE dslist;

Configure your database connection in application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/dslist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
Run the project:
./mvnw spring-boot:run

________________________________________

🚀 Future Improvements
Add pagination and filtering
Integrate with a front-end using React or Angular
Add authentication with Spring Security (JWT)
Add Swagger documentation
________________________________________
👨‍💻 Author
Diego Melo Bezerra dos Santos
🔗 github.com/SEU_USUARIO

