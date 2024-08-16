/*
 * Simple Calculator - To explore the Java Basics and Syntax
 */
package com.sriram;
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
