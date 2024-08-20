# api-clients - Sistema de Gerenciamento de Clientes

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

api-clients é uma aplicação backend monolítica desenvolvida para o gerenciamento de clientes, oferecendo uma interface simples e eficiente para realizar operações de CRUD (Create, Read, Update, Delete) em dados de clientes.

# Funcionalidades Principais

A aplicação disponibiliza uma API REST que permite:

Gerenciar Clientes: Realizar operações de criação, visualização, atualização e exclusão de registros de clientes, facilitando a administração de informações de forma centralizada.

# O que a aplicação proporciona?

api-clients foi projetada para oferecer uma solução direta e eficaz para o gerenciamento de clientes em sistemas diversos. Com sua arquitetura monolítica, a aplicação assegura uma integração coesa de todas as funcionalidades necessárias para a manutenção e controle dos dados dos clientes.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Colletions Postman](#collection-postman)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/IgorTecnologia/dev-superior-api-clients.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## Collection Postman

Download these files and import them into your Postman to use the ready-made HTTP methods along with the already configured environment variables, to perform the requests/responses

[Download Collections](https://github.com/IgorTecnologia/dev-superior-api-clients/blob/docs-postman/Api-client-Collection.json)

[Download Environment variables](https://github.com/IgorTecnologia/dev-superior-api-clients/blob/docs-postman/Local-host-environment.json)

## API Endpoints
The API provides the following endpoints:

**GET USERS**
```markdown
GET /clients - Retrieve a pagination of all clients.
```
```json
"content": [
        {
            "id": 8,
            "name": "Igor Gonçalves",
            "cpf": "123.456.789-10",
            "income": 5000.0,
            "birthDate": "1998-01-31T18:50:07.123450Z",
            "children": 1
        }
```
**GET clients/ID**
```markdown
GET /clients/id - Retrieve a single client by id.
```

```json
{
    "id": 8,
    "name": "Igor Gonçalves",
    "cpf": "123.456.789-10",
    "income": 5000.0,
    "birthDate": "1998-01-31T18:50:07.123450Z",
    "children": 1
}
```
**POST USERS**
```markdown
POST /clients - Register a new client into the App
```
```json
{
    "name": "Pedro Henrrique",
    "cpf": "123.456.789.19",
    "income": 3000.9,
    "birthDate": "2000-06-10T03:50:07.123450Z",
    "children": 1
}
```
**PUT USERS**
```markdown
PUT/clients/id - Update a client in the application by id.
```
```json
{
    "name": "João Silva",
    "cpf": "123.456.789-10",
    "income": 2200.16,
    "birthDate": "1992-06-10T20:50:07.123450Z",
    "children": 4
}
```
**DELETE CLIENTS**
```markdown
DELETE/client/id - Delete a client in the application by id.
return HTTP status: 204 NO CONTENT
```
## Database
The project utilizes [H2 Database](https://www.h2database.com/html/tutorial.html) as the database.

## Technologies Used

- Java version 11
- Spring Boot
- Maven
- H2 Database
- Spring Tool Suite 4
- Postman

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, [convenções de commit](https://medium.com/linkapi-solutions/conventional-commits-pattern-3778d1a1e657), e envie suas alterações em uma branch separado.

![imagem 1](https://wallpapercave.com/wp/wp11430559.jpg)
