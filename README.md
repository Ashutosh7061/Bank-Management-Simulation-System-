# 💳 Bank Management and Simulation System

The **Bank Management and Simulation System** is a Java-based desktop application designed to simulate the core functionalities of a banking system. It offers an interactive GUI for managing user accounts, transactions, and personal banking operations securely and efficiently.

---

## 🛠️ Tech Stack & Tools

- **Java** – Core application logic
- **Java Swing** – GUI development
- **OOP (Object-Oriented Programming)** – Modular and maintainable code
- **MySQL** – Persistent database for user data, transactions, and login system

---

## ✨ Features

- 🔐 **Login System**  
  Secure login using account number and PIN authentication.

- 🧾 **Account Creation**  
  Allows users to open a new bank account with their details.

- 💰 **Deposit / Withdraw / Fast Withdraw**  
  Simple and fast methods to manage account balance with input validation.

- 🧾 **Bank Statement**  
  Displays recent transaction history of the account.

- 🔄 **PIN Change**  
  Enables users to change their security PIN.

- 🧮 **Balance Enquiry**  
  Lets users check their current account balance.

---

## 📁 Project Structure

```text
Bank-Management-System/
│
├── src/                      # All Java source files (GUI, logic, DB connection)
│   ├── AccountCreation.java
│   ├── Login.java
│   ├── Withdraw.java
│   ├── Deposit.java
│   ├── PinChange.java
│   ├── BankStatement.java
│   ├── BalanceEnquiry.java
│   └── Main.java
│
├── icon/                     # Icons and image assets
│   ├── logo.png
│   ├── background.jpg
│   └── ...
│
├── database/                 # SQL scripts for table creation and initial data
│   ├── bank_schema.sql
│   └── sample_data.sql
│
└── README.md                 # Project documentation
```
---
