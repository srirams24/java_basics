//  Simple Calculator - To explore the Java Basics and Syntax

/*
 ***Package**: In Java, a package is a namespace that organizes a set of related classes and interfaces. Conceptually you can think of packages as being similar to different
 folders on your computer. They help keep classes with the same name separate and organized. The com.sriram part is known as the package name, which typically follows the
 reverse domain name convention to ensure uniqueness across projects.
 */
package com.sriram;

/*
 **Class**: A class is a blueprint for creating objects (a particuler data structure), providing initial values for state (member variables or attributes), and
 implementations of behavior (methods).
 **Access Modifier**: The public keyword specifies that this class is accessible everywhere.
 **Class Naming**: The class name SimpleCalculator suggests its purpose—to perform basic arithmetic operations.
 */
public class SimpleCalculator {

    /*
     **Main Method**: The main method is the entry point for any Java application. When you run your program, the Java Virtual Machine (JVM) searches for the main method
       and starts executing from there. The static keyword indicates that the method belongs to the SimpleCalculator class itself, rather than to instances of the class. The
       void keyword signifies that this method doesn't return any value. The String[] args parameter allows command-line arguments to be passed to the program.
    */
    public static void main(String[] args) {

        /*
         **Object Creation**: The new keyword is used to create an instance of a class(memory allocation). Here, calci is an object of the SimpleCalculator class. This object can now be used to
         call methods defined within the class.
         **Object**: a real-time entity that represents a class. It encapsulates both state and behavior, making it a fundamental concept in OOP.
         */
        SimpleCalculator calci = new SimpleCalculator();
        String result = calci.add(1,2);
        calci.displayResult(result);

    }

    String add(float num1, float num2){
        return String.valueOf(num1 + num2);
    }

    void displayResult(String res){
        System.out.println(res);
    }

}
