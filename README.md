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

🔗 [Live API Documentation](https://documenter.getpostman.com/view/37432471/2sB2qah1fB)

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

### GET `/`
- **Description**: Health check endpoint. Verifies the server is running.
- **Response**: `200 OK`

---

### GET `/api/v1/software-engineers`
- **Description**: Fetch all software engineer profiles.
- **Response**: List of all users with `id`, `name`, `techStack`, and `learningPathRecommendations`.

---

### GET `/api/v1/software-engineers/{id}`
- **Description**: Fetch a software engineer by their unique `id`.
- **Path Variable**: `id` (Integer) – ID of the software engineer.
- **Response**: A single software engineer object.

---

### POST `/api/v1/software-engineers`
- **Description**: Create a new software engineer profile.
- **Headers**: `Content-Type: application/json`
- **Request Body**:
```json
{
  "name": "john",
  "techStack": "java, spring, angular",
  "learningPathRecommendations": "Master Spring, Explore Microservices, Study System Design"
}
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

