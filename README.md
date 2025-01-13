
# SmartPresence:Student and Attendance Tracker 📘🎓

SmartPresence is a robust and scalable education management system developed using **Spring Boot** and **Hibernate**. It streamlines educational workflows by managing students, subjects, users, and attendance records efficiently. The project follows a modular architecture with clearly defined layers to ensure maintainability and scalability.

---

## 🚀 Features

- **Student Module**: Manage student records seamlessly.
- **Subject Module**: Handle subject-related operations with ease.
- **User Module**: User authentication and role-based access.
- **Attendance Module**: Keep track of attendance records efficiently.
- **Service-Oriented Architecture**: Encapsulation of business logic in the service layer.
- **API Testing**: Comprehensive API testing using **Postman**.
- **Spring Boot & Hibernate**: Leveraging modern frameworks for reliability and performance.

---

## 🛠️ Technology Stack

- **Backend Framework**: Spring Boot
- **ORM**: Hibernate
- **Database**: SQL (e.g., MySQL, PostgreSQL)
- **API Testing**: Postman
- **Languages**: Java
- **Tools**: Maven, Git, Eclipse IDE

---

## 📂 Project Structure

```
SmartPresence/
├── src/main/java/com/smartpresence/
│   ├── controller/
│   │   ├── StudentController.java
│   │   ├── SubjectController.java
│   │   ├── UserController.java
│   │   └── AttendanceRecordController.java
│   ├── service/
│   │   ├── StudentService.java
│   │   ├── SubjectService.java
│   │   ├── UserService.java
│   │   └── AttendanceService.java
│   ├── dao/
│   │   ├── StudentRepository.java
│   │   ├── SubjectRepository.java
│   │   ├── UserRepository.java
│   │   └── AttendanceRepository.java
│   ├── model/
│   │   ├── Student.java
│   │   ├── Subject.java
│   │   ├── User.java
│   │   └── AttendanceRecord.java
│   └── utils/
│       └── CustomUtils.java
├── src/main/resources/
│   ├── application.properties
│   └── data.sql
└── pom.xml
```

---

## 💻 API Endpoints

### Student Module
| HTTP Method | Endpoint            | Description               |
|-------------|---------------------|---------------------------|
| GET         | `/students`         | Get all students          |
| POST        | `/students`         | Add a new student         |
| PUT         | `/students/{id}`    | Update a student by ID    |
| DELETE      | `/students/{id}`    | Delete a student by ID    |

### Subject Module
| HTTP Method | Endpoint            | Description               |
|-------------|---------------------|---------------------------|
| GET         | `/subjects`         | Get all subjects          |
| POST        | `/subjects`         | Add a new subject         |
| PUT         | `/subjects/{id}`    | Update a subject by ID    |
| DELETE      | `/subjects/{id}`    | Delete a subject by ID    |

*More API details available in the Postman collection.*

---

## 🧪 Testing with Postman

Postman was used extensively for API testing.

---

## 🏗️ Architecture

The application is structured into multiple layers:

1. **Controller Layer**: Handles HTTP requests and responses.
2. **Service Layer**: Contains business logic.
3. **DAO Layer**: Data Access Objects for database interactions.
4. **Model Layer**: Defines the data models.

---

## 📖 Getting Started

### Prerequisites
- JDK 11 or higher
- Maven
- MySQL or PostgreSQL
- Postman (optional)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/username/SmartPresence.git
   ```
2. Navigate to the project directory:
   ```bash
   cd SmartPresence
   ```
3. Configure `application.properties` with your database details.
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application at `http://localhost:8080`.

---

✨ **SmartPresence** – Empowering Education with Technology! ✨

