package com.devops.lab;

/**
 * Simple Calculator class for demonstration
 */
public class Calculator {
    
    /**
     * Add two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtract two numbers
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiply two numbers
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide two numbers
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
}
