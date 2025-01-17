# Banking System - Database Design Project

**Amirkabir University of Technology - Fall 2024**

---

## Project Overview

This project involves designing and implementing a database for a **Banking System**, developed as part of the Database Design course. It emphasizes fundamental database concepts, SQL proficiency, and integration with a backend application.

> **Note:** This project is not completed, and I believe I will not have the time to complete it.

### Key Features

- Backend developed using **Kotlin** with **Spring Boot**.
- Implementation of the **Controller-Service-Repository-Model** architecture.
- Utilization of **JDBC** for database connectivity.
- **PostgreSQL** as the database system.
- Docker Compose setup for configuring PostgreSQL and **Metabase** for database visualization.
- Secure configuration using an `.env` file.

---

## System Architecture

1. **Backend Framework**:

   - Application name: `DbProject2024Application`.
   - Organized layers: Controller, Service, Repository, and Model.

2. **Database**:

   - PostgreSQL relational database.
   - Manually written SQL queries using JDBC.

3. **Visualization**:

   - Integrated **Metabase** for analyzing and visualizing database data.

4. **Containerization**:

   - Docker Compose for seamless deployment of PostgreSQL and Metabase.

---

## What I Learned

### Database Concepts

- Writing efficient **SQL queries**.
- Using **functions**, **triggers**, and **constraints**.
- Managing **database users** for secure access.
- Designing **schemas** for relational databases.

### Design Principles

- Creating **ER diagrams** for data modeling.
- Understanding **functional dependencies** and normalization levels:
  - **1NF, 2NF, 3NF, 4NF, BCNF**.

### Application Development

- Structuring backend systems using best practices in **Spring Boot**.

---

## Project Setup

### Prerequisites

- Docker and Docker Compose installed.
- Kotlin and Spring Boot development environment.

### Environment Configuration

Set up the following variables in an `.env` file:

```env
SPRING_PROFILES_ACTIVE=local
DATABASE_HOST=localhost
DATABASE_PORT=5432
DATABASE_NAME=db_project
DATABASE_USERNAME=postgres
DATABASE_PASSWORD=123123123
SECURITY_USER_NAME=mahdi
SECURITY_USER_PASSWORD=123123123
```

### Steps to Run

1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Start services with Docker Compose:
   ```bash
   docker-compose up
   ```
3. Run the Spring Boot application:
   ```bash
   ./gradlew bootRun
   ```
4. Access Metabase at `http://localhost:3000` for database visualization.

---

## Tools and Technologies

- **Backend**: Kotlin + Spring Boot
- **Database**: PostgreSQL
- **Containerization**: Docker Compose
- **Visualization**: Metabase

---

## Schema 

![image](https://github.com/user-attachments/assets/b96b0db4-aea5-4877-8427-eefd97a73348)


## ER Diagram

![image](https://github.com/user-attachments/assets/6c170caa-40b1-4ff6-92eb-79b0e6068005)

---

## Future Improvements

- Implement more advanced query optimization.
- Enhance database security configurations.
- Add test cases for database interactions.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to contribute by opening issues or pull requests!

