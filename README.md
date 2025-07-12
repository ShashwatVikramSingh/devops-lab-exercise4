# DevOps Lab Exercise

This project demonstrates Continuous Integration and Continuous Deployment (CI/CD) using Jenkins, Maven, and Git.

## Project Structure
devops-lab-exercise/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── devops/
│   │               └── lab/
│   │                   ├── Application.java
│   │                   └── Calculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── devops/
│                   └── lab/
│                       ├── ApplicationTest.java
│                       └── CalculatorTest.java
├── pom.xml
└── README.md
## Build Instructions

### Local Build
```bash
mvn clean compile
mvn test
mvn package
