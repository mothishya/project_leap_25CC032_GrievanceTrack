# 🚨 Grievance Track

### Campus Grievance Management System

Grievance Track is a web-based campus grievance management system that allows students to submit complaints and enables administrators to manage, track, escalate and resolve grievances efficiently.

---

## 📌 Project Overview

In a college environment, students may face problems related to infrastructure, academics, electrical facilities, sanitation, transportation and other campus services.

Grievance Track provides a centralized platform where students can:

- Submit grievances
- Select grievance categories
- Track grievance status
- View grievance details
- Rate resolved grievances
- Provide feedback

Administrators can:

- View submitted grievances
- Assign grievances to departments
- Update grievance status
- Escalate unresolved grievances
- Monitor grievance statistics through a dashboard

---

## ✨ Features

### 👨‍🎓 Student Features

- Submit a grievance
- Select grievance category
- View submitted grievances
- Track grievance status
- View grievance details
- Rate resolved grievances
- Provide feedback

### 🧑‍💼 Administration Features

- View all grievances
- Update grievance status
- Assign grievances to departments
- Escalate grievances
- Monitor grievance statistics
- Manage categories
- Manage departments

### 📊 Dashboard

The dashboard provides an overview of:

- Total grievances
- Pending grievances
- In-progress grievances
- Resolved grievances
- Closed grievances

---

## 🏗️ System Architecture

```text
             ┌──────────────────────┐
             │       Student        │
             └──────────┬───────────┘
                        │
                        ▼
             ┌──────────────────────┐
             │   Thymeleaf UI       │
             │   HTML + CSS + JS    │
             └──────────┬───────────┘
                        │
                        ▼
             ┌──────────────────────┐
             │   Spring Boot       │
             │   REST Controllers   │
             └──────────┬───────────┘
                        │
                        ▼
             ┌──────────────────────┐
             │      Services        │
             │ Business Logic       │
             └──────────┬───────────┘
                        │
                        ▼
             ┌──────────────────────┐
             │ Spring Data JPA      │
             │ Hibernate            │
             └──────────┬───────────┘
                        │
                        ▼
             ┌──────────────────────┐
             │       MySQL          │
             │   grievance_track    │
             └──────────────────────┘
