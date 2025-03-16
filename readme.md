# System REST API

This is the backend REST API for the modern web application demo. It's built with Spring Boot and provides a RESTful API for managing data.

## 1. Repository Structure

This repository is part of a three-repository architecture:

1. **system-demo**: The main coordinator repository containing Docker Compose configuration, CI/CD setup, and documentation
2. **system-rest** (this repository): The backend Spring Boot REST API
3. **system-vue**: The frontend Vue.js application

## 2. Development Setup

For development, this repository should be cloned **inside** the system-demo directory:

```bash
# First, clone the main coordinator repository
git clone https://github.com/YOUR_USERNAME/system-demo.git
cd system-demo

# Then clone this repository inside system-demo
git clone https://github.com/YOUR_USERNAME/system-rest.git

# Also clone the frontend repository
git clone https://github.com/YOUR_USERNAME/system-vue.git
```

The final directory structure should look like this:

```
system-demo/             # Main coordinator repository
├── system-rest/         # This backend repository
└── system-vue/          # Frontend repository
```

Note: The `.gitignore` file in the main repository is configured to ignore the component folders, allowing each repository to maintain its own Git history.

## 3. Technologies Used

- Spring Boot 3
- Spring Data JPA
- PostgreSQL Database
- OpenAPI/Swagger Documentation

## 4. Running Locally

### 4.1 Prerequisites

- Java 17 or higher
- Maven
- Docker (optional, for containerized deployment)

### 4.2 Running with Maven

```bash
# Run with Maven
./mvnw spring-boot:run

# Or with specific profile
./mvnw spring-boot:run -Dspring-boot.run.profiles=postgres
```

### 4.3 Running with Docker Compose (Recommended)

The recommended way to run the complete system is using Docker Compose from the main system-demo repository:

```bash
# From the system-demo directory
docker compose up --build
```

This will start the backend, frontend, and database together.

## 5. API Documentation

When the application is running, you can access the API documentation at:

- http://localhost:9966/system/swagger-ui/index.html

## 6. Configuration

The application can be configured using environment variables or application properties. Key configuration options:

- `SPRING_PROFILES_ACTIVE`: Set to `postgres` for PostgreSQL, `h2` for in-memory database
- `SPRING_DATASOURCE_URL`: Database connection URL
- `SPRING_DATASOURCE_USERNAME`: Database username
- `SPRING_DATASOURCE_PASSWORD`: Database password
- `SERVER_SERVLET_CONTEXT_PATH`: Context path for the application (default: `/system`)

## 7. Version Information

This component is part of the system-demo v0.1.0. All components are versioned together as a single unit, with version control managed by the main system-demo repository.

## 8. License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.
