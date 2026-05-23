# 📱 Android Mobile Automation Framework (To-Do App)

A professional, robust Mobile Test Automation Framework designed for Android applications using **Appium**, **Java**, and **TestNG**. This project implements clean code architecture and best practices to ensure scalable and maintainable mobile testing.

---

## 🛠️ Tech Stack & Dependencies

* **Language:** Java (JDK 11+)
* **Mobile Automation Engine:** Appium (Java-Client 8.x)
* **Test Runner:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

---

## ✨ Framework Key Features

* **Page Object Model (POM):** Strict separation between test logic and UI elements/interactions for high maintainability.
* **Robust Synchronization:** Implements dynamic **ExpectedConditions** (Explicit Waits) to handle mobile element loading and prevent flakiness.
* **Action Automation:** Customized wrapper methods for handling standard mobile gestures and interactions seamlessly.
* **Scalable Configurations:** Managed capabilities via Appium Options for flexible device and session initialization.
* **Test Automation Execution:** Organized test suites utilizing TestNG for structured assertions and test flow control.

---

## 📁 Project Structure

```text
src/
├── main/java/
│   └── Task_Page.java        # Page Objects & UI Locators/Actions
└── test/java/
    └── Test_Class.java       # Test Cases & Execution Flow
