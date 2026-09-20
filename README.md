# Student Eligibility Checker for Roles

A simple Java console application that checks whether a student is eligible for different internship or job roles based on rules like branch, CGPA, graduation year, active backlogs, and required skills.

This project is built to practice:
- Java programming
- object-oriented design
- data validation
- collections and set operations
- role-based eligibility checking

---

## What this project does

The application asks the user for student details such as:
- branch
- CGPA
- graduation year
- active backlogs
- skills

It then validates the input and checks the student against a list of predefined roles.

For each role, it checks whether the student meets all conditions:
- allowed branch
- minimum CGPA
- allowed graduation year
- maximum backlogs
- required skills

Finally, it prints:
- how many roles the student is eligible for
- which roles are eligible
- which roles are not eligible and why

---

## Why this project is useful

This project helps understand how to:
- validate user input
- convert raw data into clean data
- compare a student profile with business rules
- use Java classes and objects effectively
- work with lists, sets, and sorting in Java

---

## Project structure

```text
src/
├── com/
│   ├── database/
│   │   └── DataRepositry.java
│   ├── dto/
│   │   ├── Role.java
│   │   ├── RoleResult.java
│   │   ├── StudentDTO.java
│   │   └── ValidatedStudentDTO.java
│   ├── manager/
│   │   ├── Input.java
│   │   └── main.java
│   └── service/
│       ├── EligibilityService.java
│       ├── enCapsulatedValidatedResult.java
│       └── Validator.java
```

### Main classes

- `main.java` - program entry point
- `Input.java` - collects student data from the console
- `StudentDTO.java` - stores the raw student input
- `Validator.java` - validates the input values
- `ValidatedStudentDTO.java` - stores cleaned and validated student details
- `EligibilityService.java` - checks the student against all roles
- `DataRepositry.java` - contains the predefined role list
- `Role.java` - defines a role and its requirements
- `RoleResult.java` - stores eligibility result for each role

---

## How the application works

### 1. User enters data
The program asks the user to enter:
- branch
- CGPA
- graduation year
- active backlogs
- skills

### 2. Input is validated
The validator checks:
- branch is not empty and does not contain numbers
- CGPA is numeric and between 1 and 10
- graduation year is numeric and in a valid range
- backlogs are not negative
- skills are cleaned and duplicates removed

### 3. Validated student object is created
If input is valid, it creates a `ValidatedStudentDTO` object with cleaned data.

### 4. Each role is checked
For every role in the role repository, the app checks whether the student satisfies all conditions.

### 5. Final result is printed
The program prints:
- total eligible roles
- total ineligible roles
- each role with its status
- reason for failure if not eligible

---

## Example flow

```text
Program starts
  ↓
Input taken from user
  ↓
StudentDTO created
  ↓
Validator checks values
  ↓
ValidatedStudentDTO created
  ↓
EligibilityService compares student against each Role
  ↓
RoleResult created for each role
  ↓
Results are sorted and displayed on console
```

---

## Example role rules

Each role has its own requirements, such as:
- allowed branches
- minimum CGPA
- allowed graduation years
- maximum active backlogs
- required skills

Example:
- Student must be from CSE or IT
- Minimum CGPA must be 7.5
- Graduation year must be 2027
- Backlogs must be 1 or less
- Required skill may be Python or Git

---

## Features list

- validates student input
- removes duplicate skills
- converts skills to lowercase for comparison
- checks multiple role conditions
- prints eligible and ineligible roles
- sorts results by eligibility and title
- handles multiple failure reasons for a single role

---

## How to run the project

### Prerequisites
- Java JDK installed
- Terminal or IDE

### Compile the project

From the root of the project, run:

```bash
javac -d out $(find src -name "*.java").
```

Then run:

```bash
java -cp out com.manager.main
```

If you are using an IDE such as IntelliJ IDEA or Eclipse, you can simply run `main.java` from the `com.manager` package.

---

## Sample input

```text
Enter the Branch :
CSE

Enter the Cgpa :
8.7

Enter the Graduation Year :
2027

Enter the Active Backlogs :
0

Enter the Skills (comma-separated, e.g. Git, Python, SQL) :
Python, Git
```

---

## Sample output

```text
ELIGIBLE : 2 || INELIGIBLE : 3
--------------------------------------------------
CF02 - QA Automation Intern [ELIGIBLE]
CF04 - Machine Learning Intern [ELIGIBLE]
CF01 - Data Operations Intern [INELIGIBLE]
   Failed Reasons: MISSING_SKILL: SQL
--------------------------------------------------
```

---

## Notes

This project is a learning application and uses a fixed in-memory role repository. That means roles are defined directly in the code and not loaded from a database or external file.

The naming of some classes is intentionally simple and beginner-friendly, but some names could be improved for production-level Java standards.

---

## Learning outcomes

After understanding this project, you will learn:
- how to design a simple Java program with multiple classes
- how to validate user input before using it
- how to use collections like `List` and `Set`
- how to compare data against rules
- how to build a simple decision-making system

---

## Future improvements

Possible improvements for this project:
- use a proper database or JSON file for roles
- add proper unit tests
- improve naming conventions
- add more validation rules
- create a GUI or web version
- use enums for error types and statuses
- refactor service logic into smaller methods

---

## Conclusion

This project is a great beginner-level Java application that demonstrates how to validate student data and match it against role eligibility rules. It is a practical example of using Java classes, collections, validation, and business logic together.

---

## License

This project currently does not include a license file.

