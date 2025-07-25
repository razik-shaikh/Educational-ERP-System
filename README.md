
# 📚 College ERP System

A simple and modular **College ERP System** built with **Spring Boot (Backend)** and **Angular 19 (Frontend)**.

---

## 🚀 Features

| Module         | Description                                   |
|----------------|-----------------------------------------------|
| Student        | Add, view, update, delete students            |
| Course         | Manage course details                         |
| Faculty        | Manage teachers and assign departments        |
| Department     | Manage departments and heads                  |
| Enrollment     | Assign students to courses                    |
| Admin (basic)  | Create admin account (authentication optional)|
| Dashboard      | View counts of all modules                    |

---

## 🛠 Tech Stack

- **Backend**: Spring Boot, MySQL, JPA
- **Frontend**: Angular 19, Bootstrap 5, TypeScript
- **API Testing**: Postman
- **Database**: MySQL

---

## 📂 Project Structure

```
/college-erp-backend   --> Spring Boot Project
/college-erp-frontend  --> Angular 19 Project
```

---

## ⚙️ Setup Instructions

### 1️⃣ Backend (Spring Boot)

- Import project in any IDE (IntelliJ/STS)
- Configure **MySQL DB** in `application.properties`
- Run `CollegeErpApplication.java`

### 2️⃣ Frontend (Angular)

```bash
cd college-erp-frontend
npm install
ng serve
```

---

## 🌐 API Endpoints (Sample)

| Method | URL                        | Description               |
|--------|----------------------------|---------------------------|
| GET    | `/all-students`           | Get all students          |
| POST   | `/add-student`            | Add a student             |
| POST   | `/enroll?studentId=&courseId=` | Enroll student        |
| POST   | `/admin/register`         | Register new admin        |

Full list: see **Postman Collection** (included)

---

## 📊 Dashboard Example

- Total Students: X
- Total Courses: Y
- Total Faculty: Z
- Total Departments: N
- Total Enrollments: M

---

## ✅ Status

> Backend complete ✅  
> Frontend in progress (Add/Edit/Delete done for major modules)  
> Security (Spring Security) – pending

---

## 🙌 Author

Developed by [Your Name]  
Beginner-friendly project to practice **full-stack development**

---

## 📌 License

This project is open-source. Free to use and modify.
