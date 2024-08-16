// Package declaration
package com.sriram;

/**
 * A simple calculator application demonstrating basic arithmetic operations.
 */
public class SimpleCalculator {

    /**
     * The entry point for the application.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Instantiate the SimpleCalculator object
        SimpleCalculator calculator = new SimpleCalculator();

        // Perform addition and store the result
        String result = calculator.add(1, 2);

        // Display the result
        calculator.displayResult(result);
    }

    /**
     * Adds two floating-point numbers and returns the result as a string.
     *
     * @param num1 The first operand.
     * @param num2 The second operand.
     * @return A string representation of the sum of num1 and num2.
     */
    String add(float num1, float num2) {
        return String.valueOf(num1 + num2);
    }

    /**
     * Prints the given string to the standard output.
     *
     * @param res The string to be printed.
     */
    void displayResult(String res) {
        System.out.println(res);
    }
}
