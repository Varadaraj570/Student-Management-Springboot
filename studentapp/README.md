# 🎓 Student Management System (Spring Boot)

## 📌 Description
This is a REST API built using Spring Boot for managing student records.
It supports full CRUD operations with validation and exception handling.

---

## 🚀 Features
- ➕ Create Student
- 📄 Get All Students
- 🔍 Get Student by ID
- ✏️ Update Student
- ❌ Delete Student
- ✅ Input Validation
- ⚠️ Global Exception Handling

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Postman

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|-------|--------|------------|
| POST | /students | Create student |
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |

---

## 🧪 Sample Request

```json
{
  "name": "Deepak",
  "email": "test@gmail.com",
  "course": "CSE"
}