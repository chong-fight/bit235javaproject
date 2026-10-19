# BIT235 Java OOP Project

This repository contains the Java project for **BIT235 - Java Object Oriented
Programming (OOP)**.

The program is a small student score report that demonstrates the four core
ideas of object-oriented programming:

- **Encapsulation** - fields are private and accessed through methods.
- **Inheritance** - `GraduateStudent` extends `Student`.
- **Polymorphism** - each student type provides its own `getLevel()` result.
- **Abstraction** - the report works with `Student` objects without caring
  about the concrete subclass.

## Project structure

```text
bit235javaproject/
|-- README.md
|-- .gitignore
`-- src/
    `-- bit235/
        |-- Main.java
        |-- Student.java
        `-- GraduateStudent.java
```

## How to run

Open the folder in VS Code, then run `Main.java`, or use a terminal:

```bash
javac -d out src/bit235/*.java
java -cp out bit235.Main
```

## Author

He Yichong
