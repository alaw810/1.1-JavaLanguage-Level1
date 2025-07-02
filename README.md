# 🎓 Java Language Exercises – Level 1

This repository contains two object-oriented programming exercises written in Java, focused on foundational concepts such as **inheritance**, **abstract classes**, **interfaces**, **static vs instance members**, and **class loading behavior**.

These projects were created for educational purposes as part of a Java learning path.

---

## 📁 Contents

### 1️⃣ Exercise 1 – Musical Instruments & Class Loading

- Create an abstract class `Instrument` with a static method and static block.
- Implement subclasses: `PercussionInstrument`, `StringInstrument`, `WindInstrument`.
- Demonstrates:
  - Abstract method overriding
  - Class loading using `static` blocks
  - How static methods and object instantiation affect class loading

### 2️⃣ Exercise 2 – Car Class: Static vs Final

- Create a `Car` class with attributes:
  - `brand` (static final)
  - `model` (static)
  - `power` (final)
- Include:
  - A static method `brake()`
  - An instance method `accelerate()`
- Demonstrates:
  - Differences between static/final/instance members
  - How to call static and non-static methods from `main()`

---

## 💻 Technologies Used

- **Java 24 (OpenJDK 24.0.1)**
- IntelliJ IDEA
- Git & GitHub

---

## 📋 Requirements

To compile and run the project, you'll need:

- Java SDK **24.0.1** or higher (preferably OpenJDK 24)
- A Java-compatible IDE such as IntelliJ IDEA or Eclipse
- Git installed (optional, for version control)

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/alaw810/1.1-JavaLanguage-Level1.git

2. Open the project in your IDE.

3. Navigate to the `Main.java` file of each exercise:

   * For Exercise 1: `ex1.Main`
   * For Exercise 2: `ex2.Main`

4. Run the `main()` method and observe the console output.

---

## 🧠 Learning Outcomes

* Understand how abstract classes and interfaces work in Java
* Learn the difference between static, final, and instance-level members
* Explore how class loading works and how to track it with `static` blocks
* Practice clean class design, inheritance, and method overriding

---

## 🤝 Contributions

This is a personal educational project.
Feel free to fork the repository and suggest improvements through pull requests.
