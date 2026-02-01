# Number_Guessing_Game
A robust, console-based "Guess the Number" game built with Java. The program challenges players to guess a randomly generated number between 1 and 100 within a limited number of attempts, while tracking their score across multiple rounds.

## 🚀 Features

* **Random Number Generation:** Every round features a new secret number.
* **Attempt Limit:** Players have 5 attempts to guess the correct number.
* **Input Validation:** The game handles non-integer inputs (like text or symbols) without crashing, prompting the user to try again.
* **Score Tracking:** Tracks "Games Won" and "Total Rounds Played" throughout the session.
* **Replayability:** Users can choose to play multiple rounds without restarting the application.

## 🛠️ Logic Flow

The game uses a nested loop structure to manage the game state:
1.  **Outer Loop:** Manages the overall game session and score tracking.
2.  **Inner Loop:** Manages the 5-attempt limit for the current secret number.



## 📋 Prerequisites

* Java Development Kit (JDK) 8 or higher.
* A terminal or IDE (IntelliJ IDEA, Eclipse, VS Code).

## 📥 Installation & Running

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/yourusername/guessing-game-java.git](https://github.com/yourusername/guessing-game-java.git)
    ```
2.  **Navigate to the directory:**
    ```bash
    cd guessing-game-java
    ```
3.  **Compile the program:**
    ```bash
    javac Main.java
    ```
4.  **Run the program:**
    ```bash
    java Main
    ```

## ⚠️ Error Handling

The application is protected against `java.util.InputMismatchException`. If a user enters a string (e.g., "abc") instead of a number, the program utilizes `Scanner.hasNextInt()` to validate the input and `Scanner.next()` to clear the invalid buffer, ensuring a smooth user experience.

---
Created with ❤️ by [Your Name]
