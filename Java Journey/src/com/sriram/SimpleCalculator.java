//  Simple Calculator - To explore the Java Basics and Syntax

/*
 ***Package**: In Java, a package is a namespace that organizes a set of related classes and interfaces. Conceptually you can think of packages as being similar to different
 folders on your computer. They help keep classes with the same name separate and organized. The com.sriram part is known as the package name, which typically follows the
 reverse domain name convention to ensure uniqueness across projects.
 */
package com.sriram;

/*
 **Class**: A class is a blueprint for creating objects (a particuler data structure), providing initial values for state (member variables or attributes), and
 implementations of behavior (methods). The public keyword specifies that this class is accessible everywhere. The class name SimpleCalculator suggests its purpose—to
 perform basic arithmetic operations.
 */

public class SimpleCalculator {

    public static void main(String[] args) {

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
