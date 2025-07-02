## 📄 Description – Exercise Statements

### Exercise 1 – Musical Instruments and Class Loading

- Create an abstract class `Instrument` with attributes: `name` and `price`, and an abstract method `play()`.
- Subclasses (`WindInstrument`, `StringInstrument`, and `PercussionInstrument`) must implement the `play()` method with different console outputs.
- Use a static block to demonstrate that a class is only loaded once in Java.
- Show that class loading can be triggered by creating the first instance or accessing a static member.
- Introduce static and initialization blocks to visualize class loading behavior.

### Exercise 2 – Car Class and Static vs Final Members

- Create a `Car` class with the following attributes:
   - `brand` → `static final`
   - `model` → `static`
   - `power` → `final`
- Demonstrate the difference between these modifiers and which ones can be initialized in the constructor.
- Add:
   - A **static method** `brake()` that prints: “The vehicle is braking.”
   - A **non-static method** `accelerate()` that prints: “The vehicle is accelerating.”
- Show how to invoke both methods from the `main()` method in the principal class.

---

## 💻 Technologies Used

- Java 24
- IntelliJ IDEA
- Git & GitHub

---

## 📋 Requirements

To run this project, you will need:

- **Java SDK** version 24 or higher
- **IntelliJ IDEA** (Community or Ultimate)
- **Git** installed on your machine
- Internet connection (if you want to clone from GitHub)

---

## 🛠️ Installation

Follow these steps to set up the project locally:

1. Clone the repository:

   ```bash
   git clone https://github.com/Alaw810/1.1-JavaLanguage-Nivell1.git

2. Open the project with IntelliJ IDEA:

    File → Open → Select the project folder.

3. Make sure your project SDK is set to Java 24 or higher:

    File → Project Structure → Project SDK

---

## 🌐 Deployment

This is a simple Java console application for educational purposes and does not require deployment to a production environment. However, it can be exported as a .jar` file if needed:

1. In IntelliJ IDEA:

   Build → Build Artifacts → Build → Locate the `.jar` file in the `out/artifacts folder.

2. Run de `.jar` file using:

    ```bash
   java -jar InstrumentProject.jar

---

## 🤝 Contributions

These are academic exercises, so contributions are not expected.
However, if you'd like to collaborate:

1. Fork the project

2. Create a new branch (`git checkout -b feature/your-feature`)

3. Commit your changes

4. Push to your branch

5. Open a Pull Request