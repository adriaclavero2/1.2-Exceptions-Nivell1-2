📄 Description – Exercise Statement

This project includes two exercises focused on exception handling in Java.

Level 1 – Exercise 1

Create a class named Product with attributes name and price, and another class named Sale with a collection of products and a total sale price. The Sale class includes a method calculateTotal() which throws a custom exception EmptySaleException if the product list is empty, displaying the message:"To make a sale, you must first add products. "If the list contains products, the method calculates the total price by summing all product prices. The EmptySaleException class extends Exception and receives the message in its constructor. When caught, the exception message is displayed using getMessage().Additionally, the exercise requires writing code to generate and catch an IndexOutOfBoundsException.

Level 2 – Exercise 1

Create a class named Entrada to manage input-related exceptions using Java’s Scanner. The class must instantiate a Scanner object and provide static methods to read different data types from the keyboard. If an exception occurs, the method must handle it and prompt the user again until valid input is received.For example, if a user enters a float with a dot instead of a comma, the program should display "Format error" and keep asking until the input is correct.Each method receives a String message to display and returns the corresponding user input.
 
💻 Technologies Used

Java 17
IntelliJ IDEA
Git & GitHub
Java Collections Framework
Exception handling (try/catch, custom exceptions)
Scanner class for user input

📋 Requirements

Java JDK 17 or higher
IntelliJ IDEA or any Java-compatible IDE
Git installed for version control
No external libraries required

🛠️ Installation

Clone the repository:git clone https://github.com/your-username/Sprint1_Tasca2_Ex1.git
Open the project in IntelliJ IDEA.
Ensure the JDK is correctly configured (Java 17 or higher).

▶️ Execution

Run the Main.java file located in /Sprint1_Tasca2_Ex1/src/ for Level 1.
Run the Main.java file located in /Sprint1_Tasca2_Ex1_Level2/src/ for Level 2.
Follow the console prompts to test input validation and exception handling.

🌐 Deployment

This project is designed for local execution and educational purposes. No production deployment is required.
  
🤝 Contributions

This is a personal learning project.If you'd like to contribute:
Fork the repository
Create a feature branch
Submit a pull request with clear descriptions
Follow Java naming conventions and comment your code.
