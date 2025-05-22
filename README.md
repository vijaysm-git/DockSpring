# 🚀 DockSpring – A Scalable Backend API with Spring Boot, PostgreSQL & Docker

DockSpring is a backend-only project built for production-readiness. It leverages Spring Boot, PostgreSQL, and Docker to create a solid foundation for RESTful API services — perfect for scalable enterprise systems or microservice-style architecture.

---

## 🧱 Tech Stack

| Layer        | Tech                     |
|--------------|--------------------------|
| Language     | Java 17                  |
| Framework    | Spring Boot              |
| Database     | PostgreSQL               |
| API Testing  | Postman                  |
| Container    | Docker + Docker Compose  |
| Build Tool   | Maven                    |
| Version Ctrl | Git & GitHub             |
| Deployment   | Docker Compose (Local)   |

---

# 📘 API Documentation – Spring Boot SWE Tracker

Explore the complete RESTful API via Postman:

🔗 [Live API Documentation](https://documenter.getpostman.com/view/xxxxxx/backend-api)

This includes:
- Full CRUD for Software Engineers
- JSON payload examples
- Live test endpoints (when server is running locally)

Built with Java, Spring Boot, PostgreSQL, and Docker.


## ⚙️ Features

- ✅ Clean RESTful API structure
- ✅ PostgreSQL integration via Docker volume
- ✅ Custom Docker networking for service isolation
- ✅ API tested with Postman
- ✅ Production-style folder structure
- ✅ Containerized PostgreSQL and Spring Boot App

---

## 🧪 API Endpoints

| Method | Endpoint        | Description              |
|--------|------------------|--------------------------|
| GET    | `/api/items`     | List all items           |
| POST   | `/api/items`     | Add a new item           |
| PUT    | `/api/items/{id}`| Update an item           |
| DELETE | `/api/items/{id}`| Delete an item           |

---

## 🐳 How to Run Locally (Docker)

1. Clone the repository:
   ```bash
   git clone https://github.com/vijaysm-git/dockspring.git
   cd dockspring
2.Connect Postgres to Docker
   docker compose up -d
   docker exec -it postgres-spring-boot psql -U username -d dbname
   \c ->to connect to database

