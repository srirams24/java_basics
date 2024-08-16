### Package Declaration

```java
package com.sriram;
```
- **Package**: In Java, a package is a namespace that organizes a set of related classes and interfaces. Conceptually you can think of packages as being similar to different
 folders on your computer. They help keep classes with the same name separate and organized. The com.sriram part is known as the package name, which typically follows the
 reverse domain name convention to ensure uniqueness across projects.

### Class Declaration

```java
public class SimpleCalculator {
```
- **Class**: A class is a blueprint for creating objects (a prticulr data structure), providing initial values for state (member variables or attributes), and
 implementations of behavior (methods). The public keyword specifies that this class is accessible everywhere. The class name SimpleCalculator suggests its purpose—to
 perform basic arithmetic operations.

### Main Method

```java
public static void main(String[] args) {
```
- **Main Method**: The main method is the entry point for any Java application. When you run your program, the Java Virtual Machine (JVM) searches for the main method
 and starts executing from there. The static keyword indicates that the method belongs to the SimpleCalculator class itself, rather than to instances of the class. The
void keyword signifies that this method doesn't return any value. The String[] args parameter allows command-line arguments to be passed to the program.

### Object Instantiation

```java
SimpleCalculator calci = new SimpleCalculator();
```
- **Object Creation**: The new keyword is used to create an instance of a class. Here, calci is an object of the SimpleCalculator class. This object can now be used to
 call methods defined within the class.

### Method Calls

```java
String result = calci.add(1,2);
calci.displayResult(result);
```
- **Method Invocation**: These lines demonstrate calling methods on an object. The add method is called on the calci object, passing 1 and 2 as arguments. The result
 is stored in the result variable. Then, the displayResult method is called, passing the result string to print it to the console.

### Method Definitions

```java
String add(float num1, float num2){
    return String.valueOf(num1 + num2);
}

void displayResult(String res){
    System.out.println(res);
}
```
- **Methods**: Methods define the actions that an object can perform. The add method takes two float parameters, adds them, converts the result to a String, and
 returns it. The displayResult method takes a String parameter and prints it to the console. The void keyword indicates that this method does not return any value.

### Primitive Data Types

- **Float**: Represents a floating-point number, which is a number with a decimal point. It's one of several primitive data types in Java, which also includes int, char,
 boolean, etc.
