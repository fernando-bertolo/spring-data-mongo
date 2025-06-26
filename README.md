# Spring JPA MongoDB

Um projeto Spring Boot demonstrando a integração com MongoDB usando Spring Data MongoDB.

## 📋 Sobre o Projeto

Este é um projeto de estudos desenvolvido durante a **Fase 2** da Pós-Graduação em **Arquitetura e Desenvolvimento Java**, com foco no aprendizado e aplicação prática do **Spring Data MongoDB**

## 🚀 Tecnologias Utilizadas

- **Java 21+**
- **Spring Boot 3.x**
- **Spring Data MongoDB**
- **MongoDB**
- **Docker & Docker Compose**
- **Mongo Express** (Interface web para MongoDB)

## 📦 Pré-requisitos

Antes de executar o projeto, atende-se com os seguintes detalhes:

- [Java 21+](https://www.oracle.com/br/java/technologies/downloads/)
- [Maven 3.6+](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## 🛠️ Configuração e Instalação

### 1. Clone o repositório

```bash
git clone https://github.com/fernando-bertolo/spring-jpa-mongo.git
cd spring-jpa-mongo
```

### 2. Inicie o MongoDB com Docker Compose

```bash
docker-compose up -d
```

Este comando irá iniciar:
- **MongoDB** na porta `27017`
- **Mongo Express** na porta `8081` (interface web)

### 3. Compile o projeto

```bash
mvn clean compile
```

### 4. Execute a aplicação

```bash
mvn spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

## 🐳 Docker

### Estrutura do Docker Compose

O arquivo `docker-compose.yml` configura:

```yaml
services:
  mongo:
    image: mongo
    restart: always
    ports:
      - 27017:27017

  mongo-express:
    image: mongo-express
    restart: always
    ports:
      - 8081:8081
    environment:
      ME_CONFIG_MONGODB_URL: mongodb://mongo:27017/
      ME_CONFIG_BASICAUTH: false
    depends_on:
      - mongo
```

### Comandos Docker úteis

```bash
# Iniciar os serviços
docker-compose up -d

# Parar os serviços
docker-compose down

# Ver logs
docker-compose logs -f

# Reiniciar apenas o MongoDB
docker-compose restart mongo
```

## ⚙️ Configuração

### application.properties

```properties
spring.application.name=spring-jpa-mongo
spring.data.mongodb.uri=mongodb://localhost:27017/talkevents
```

## 🌐 Acessos

| Serviço | URL |
|---------|-----|
| Aplicação Spring Boot | http://localhost:8080 |
| Mongo Express (Web UI) | http://localhost:8081 |
| MongoDB | localhost:27017 |

## 📁 Estrutura do Projeto

```
spring-jpa-mongo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/talkevents/springjpamongo/
|   |   |       └── controllers
|   |   |       └── documents
|   |   |       └── repositories
|   |   |       └── services
│   │   │       └── SpringJpaMongoApplication.java
│   │   └── resources/
│   │       ├── application.properties
├── docker-compose.yml
├── pom.xml
└── README.md
```

## 📚 Recursos Úteis

- [Spring Data MongoDB Reference](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/)
- [MongoDB Documentation](https://docs.mongodb.com/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)


## 📧 Contato
- GitHub: [@fernando-bertolo](https://github.com/fernando-bertolo)
- LinkedIn: [Fernando Bertolo](https://www.linkedin.com/in/fernandobertolojr/)
