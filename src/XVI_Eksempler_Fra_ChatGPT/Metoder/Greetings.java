package XVI_Eksempler_Fra_ChatGPT.Metoder;

/**
 * Certainly! Methods in programming are like reusable blocks of code that perform a specific task or operation.
 * They are used to encapsulate logic and allow you to organize your code into smaller, more manageable pieces.
 * Methods are an essential concept in programming because they promote code reusability, readability, and maintainability.
 * Here's a brief overview of methods and their usage:
 *
 * What are methods?
 *
 *Methods, also known as functions in some programming languages, are named blocks of code that can perform a
 *specific action or return a value.
 *They can take input parameters (arguments) and may return a result.
 *Methods are defined with a name, a list of parameters (if any), a return type (if any),
 *and a body of code that specifies what the method does.
 *
 * Why are methods used?
 *
 *Code Reusability: Methods allow you to define a piece of code once and reuse it multiple times throughout your program.
 * This reduces redundancy and makes your code more efficient.
 *
 *Modularity: Methods help break down a complex program into smaller, more manageable parts.
 *Each method can focus on a specific task, making the code easier to understand and maintain.
 *
 *     Abstraction: Methods abstract the implementation details. When you call a method, you don't need to know how it works internally; you only need to understand its purpose and how to use it.
 *
 *     Readability: Well-named methods improve code readability and make it easier for other developers (including your future self) to understand the code.
 *
 *     Testing: Methods make it easier to test individual parts of your program in isolation, which is crucial for debugging and quality assurance.
 *
 * Examples of Methods in Java:
 *
 *     Method without Parameters and Return Value:
 */
public class Greetings {
    public static void sayHello() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        sayHello(); // Call the sayHello method
    }
}

