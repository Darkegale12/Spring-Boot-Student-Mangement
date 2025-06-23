![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.x-green.svg)
![MySQL](https://img.shields.io/badge/Database-MySQL-yellow.svg)
![Maven](https://img.shields.io/badge/Build-Maven-orange.svg)

# 🎓 Student Management System (Spring Boot Backend)

A powerful and extensible **backend REST API** built with **Java 17** and **Spring Boot 2.7**, designed to manage student and teacher records efficiently. This system adheres to best practices in modern enterprise-grade backend development — following a clean layered architecture, leveraging Spring Data JPA, and enabling seamless integration with any frontend.

---

## 🚀 Key Highlights

- ✅ **Modular 4-layered architecture**: Entity → DAO → Service → Controller  
- ⚙️ **RESTful API design** for clean frontend integration  
- 🔍 **Advanced querying** based on parameters like class, division, roll number, etc.  
- 🧩 **MySQL database integration** using Spring Data JPA & Hibernate ORM  
- 🛠️ Built with **production-ready configurations** and dev tools for rapid iteration  
- 📦 Future-ready for Dockerization, security (Spring Security), and CI/CD pipelines  

---

## 🛠️ Tech Stack

| Component       | Technology Used                         |
|----------------|------------------------------------------|
| Language        | Java 17                                 |
| Framework       | Spring Boot (v2.7.x)                    |
| Build Tool      | Maven                                   |
| ORM             | Hibernate + Spring Data JPA             |
| Database        | MySQL                                   |
| Validation      | Spring Boot Starter Validation (JSR 380)|
| Dev Tools       | Spring Boot DevTools, Postman           |
| IDE             | Eclipse / IntelliJ                      |

---

## 🧱 Project Architecture
```
com.example.Student_Management_Project/
│
├── controller/ # REST API Endpoints
│ ├── studentController.java
│ └── teacherController.java
│
├── entity/ # JPA Entity Models
│ ├── Studententity.java
│ └── Teacherentity.java
│
├── dao/ or repository/ # Data Access Layer
│ ├── StudentRepository.java
│ └── TeacherRepository.java
│
├── service/ # Business Logic Layer
│ ├── studentService.java
│ └── teacherService.java
│
└── resources/ # Configuration Files
└── application.properties 
```


## 🔗 Some Endpoints

- `GET /allStudents-in-your-class/{std}/{Division}` – Get students by class & division  
- `GET /student-attendance/{firstName}` – Retrieve attendance by student name  
- `GET /student-allInfo/{firstName}` – Fetch complete student profile  
- `GET /check-ur-classTeacher/{std}/{Division}` – Get class teacher info  
- `GET /get-students-byTeacherid/{id}` – Fetch students assigned to a teacher  
- etc.

---

## ⚙️ Design Principles

This project adheres to **SOLID principles** and follows a **clean, testable architecture**:

- 🧩 **Entity Layer** – Maps real-world models to DB tables via JPA  
- 🔌 **DAO Layer** – Interface-based data operations using Spring Data JPA  
- ⚙️ **Service Layer** – Business logic separation for maintainability  
- 🌐 **Controller Layer** – Exposes modular and RESTful endpoints  
- 📄 **Configuration** – Externalized via `application.properties` for portability  

---

## 📦 Integration & Deployment

- ✅ Fully backend-agnostic — plug it into any frontend (React, Angular, Flutter)  
- ✅ MySQL-hosted data layer — easily portable to cloud-managed DBs  
- ✅ Extendable for authentication (Spring Security), OpenAPI/Swagger, or Docker support  

---

## 👨‍💻 Author

- **Vishwajeet More**  
- 📧 [vishwajeetmore2023.comp@mmcoe.edu.in](mailto:vishwajeetmore2023.comp@mmcoe.edu.in)  
- 🌐 GitHub: [Darkegale12](https://github.com/Darkegale12)

