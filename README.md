# Game Collection API

Português | English

---

# Português

A **API RESTful** construída com **Java e Spring Boot** para gerenciar e organizar uma coleção pessoal de videogames.

A API permite que usuários recuperem jogos, os organizem em listas personalizadas e alterem sua ordem dinamicamente. O projeto segue **boas práticas modernas de desenvolvimento backend**, incluindo arquitetura em camadas, DTOs, tratamento global de exceções, testes unitários, containerização com Docker e documentação da API com Swagger.

---

# Funcionalidades

- Listar todos os jogos ou buscar um jogo específico por ID
- Organizar jogos em listas personalizadas
- Recuperar jogos por lista
- Alterar a posição/ordem dos jogos dentro de uma lista
- Arquitetura limpa utilizando **Controller → Service → Repository**
- Uso de **DTOs** para separar persistência das respostas da API
- **Tratamento global de exceções**
- **Testes unitários** para a camada de serviço
- **Documentação da API com Swagger/OpenAPI**
- **Containerização com Docker**
- Uso de **Lombok** para reduzir código boilerplate

---

# Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (para desenvolvimento)
- **JUnit 5**
- **Mockito**
- **Lombok**
- **Docker**
- **Swagger / OpenAPI**
- **Postman**

---

![Exemplo da API](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/api_games.jpg)

![Exemplo da API](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/api_lists.jpg)

---

# Arquitetura

O projeto segue uma arquitetura em camadas:

Controller → Service → Repository → Database

---

# Modelo de Domínio

![Modelo de Domínio](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/domain_model.jpg)

---

# Camadas

**Controller**
- Responsável por lidar com requisições HTTP
- Retorna respostas formatadas da API

**Service**
- Contém a lógica de negócio
- Coordena os repositórios
- Lança exceções de domínio

**Repository**
- Responsável pela persistência de dados
- Utiliza Spring Data JPA

**DTOs**
- Definem a estrutura das respostas da API
- Evitam expor diretamente as entidades do banco

---

# Estrutura do Banco de Dados

![Banco H2](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/database.jpg)

---

# Endpoints da API

![Swagger](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/swagger.jpg)

---

# Documentação da API

A documentação da API está disponível utilizando **Swagger/OpenAPI**.

Após executar o projeto, acesse:

http://localhost:8080/swagger-ui.html

---

# Testes

O projeto inclui **testes unitários para a camada de serviço** utilizando **JUnit 5** e **Mockito**.

Exemplos de cenários testados:

- Buscar jogo por ID
- Lançar exceção quando o jogo não é encontrado
- Recuperar listas
- Validação da lógica de serviço

---

# Tratamento de Exceções

Foi implementado um **Global Exception Handler** utilizando `@ControllerAdvice`.

![Exception](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/api_gamenotfound.jpg)

---

# Docker

A aplicação pode ser executada dentro de um container Docker.

### Criar imagem

docker build -t game-collection-api .
Executar container
docker run -p 8080:8080 game-collection-api

Acessar API:

http://localhost:8080

## Contact

Diego Santos

[E-mail](mailto:diegobrsantosdev@gmail.com)                                        [LinkedIn](https://www.linkedin.com/in/diegobrsantos/)

---

# English

# Game Collection API

A **RESTful API** built with **Java and Spring Boot** to manage and organize a personal video game collection.

The API allows users to retrieve games, organize them into custom lists, and change their order dynamically. The project follows **modern backend best practices**, including layered architecture, DTOs, exception handling, unit testing, containerization with Docker, and API documentation with Swagger.

---

# Features

- Retrieve all games or a specific game by ID
- Organize games into custom lists
- Retrieve games by list
- Change the position/order of games inside a list
- Clean architecture using **Controller → Service → Repository**
- Use of **DTOs** to separate persistence from API responses
- **Global exception handling**
- **Unit tests** for service layer
- **Swagger/OpenAPI documentation**
- **Docker containerization**
- Use of **Lombok** to reduce boilerplate code

---

# Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (for development)
- **JUnit 5**
- **Mockito**
- **Lombok**
- **Docker**
- **Swagger / OpenAPI**
- **Postman**


![API examplel](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/api_games.jpg)

![API example2](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/api_lists.jpg)


---

# Architecture

The project follows a layered architecture:

Controller → Service → Repository → Database

---

# Domain Model

![Domain Model](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/domain_model.jpg)

---

# Layers

**Controller**
- Handles HTTP requests
- Returns formatted responses

**Service**
- Contains business logic
- Coordinates repositories
- Throws domain exceptions

**Repository**
- Handles data persistence
- Uses Spring Data JPA

**DTOs**
- Define API response structure
- Prevent exposing entity internals

---

# Database Structure

![H2 Database](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/database.jpg)

---

# API Endpoints

>> Colocar swagger aqui

![Swagger](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/swagger.jpg)

# API Documentation

The API documentation is available using **Swagger/OpenAPI**. 

After running the project, access: http://localhost:8080/swagger-ui.html

---

# Tests

The project includes **unit tests for the service layer** using **JUnit 5** and **Mockito**

Example tested scenarios:

- Retrieve game by ID
- Throw exception when game is not found
- Retrieve lists
- Service logic validation

---

# Exception Handling

A **Global Exception Handler** was implemented using @ControllerAdvice

![Exception](https://raw.githubusercontent.com/diegobrsantosdev/Game_Collection_API/main/assets/api_gamenotfound.jpg)

---

# Docker

The application can be run inside a Docker container.

### Build image

docker build -t game-collection-api .


### Run container

docker run -p 8080:8080 game-collection-api

Access API: http://localhost:8080

---

## Contact

Diego Santos

[E-mail](mailto:diegobrsantosdev@gmail.com)                                         [LinkedIn](https://www.linkedin.com/in/diegobrsantos/)
