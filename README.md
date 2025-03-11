# Grade Calculator

A robust Java application designed for educational environments to calculate student grades across multiple subjects with detailed analytics.

## 📋 Overview

The Grade Calculator is a command-line tool that helps students and educators quickly determine grades based on subject scores. It features percentage calculation, grade determination based on standardized criteria, and result visualization.

## ✨ Features

- **Multi-subject Support**: Calculate grades for any number of subjects
- **Detailed Analytics**: View total scores, percentages, and final grades
- **User-friendly Interface**: Simple command-line prompts guide users through the process
- **Grade Classification**: Automatic grade determination based on percentage thresholds
- **Efficient Calculation**: Optimized algorithms for quick results

## 🛠️ Technical Architecture

The application follows a modular design with two main classes:

### `Main` Class
Entry point for the application that initializes the grade calculation process.

```java
public class Main {
    public static void main(String[] args) {
        GradeGenerator.MarksGetter();
    }
}
```

### `GradeGenerator` Class
Contains the core functionality including:

- `MarksGetter()`: Manages user input and orchestrates the calculation process
- `sumGenerator()`: Calculates the sum of all subject scores
- `percentageGenerator()`: Determines percentage based on total score and subject count
- `gradeGenerator()`: Assigns letter grades according to percentage thresholds

## 🚀 Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command-line interface

### Setup
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/grade-calculator.git
   cd grade-calculator
   ```

2. Compile the Java files:
   ```bash
   javac Main.java GradeGenerator.java
   ```

## 📊 Usage

1. Run the application:
   ```bash
   java Main
   ```

2. Follow the interactive prompts:
   - Enter the number of subjects
   - Input individual scores for each subject
   - Review the calculated results

### Example Session

```
_______________________________
Enter the number of subjects u have : 
5
Enter the score of the subject 1:
92
Enter the score of the subject 2:
87
Enter the score of the subject 3:
95
Enter the score of the subject 4:
78
Enter the score of the subject 5:
88
Your total is : 440.0
Your percentage is : 88.0
Your grade is : B
```

## 📊 Grading Criteria

| Grade | Percentage Range |
|-------|------------------|
| A     | 90% - 100%       |
| B     | 70% - 89.99%     |
| C     | 40% - 69.99%     |
| F     | Below 40%        |

## 🔍 Error Handling

- The application validates numeric input
- Handles input errors gracefully
- Prevents calculation of invalid percentages

