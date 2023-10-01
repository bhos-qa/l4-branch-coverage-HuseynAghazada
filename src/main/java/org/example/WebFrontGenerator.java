package org.example;

import java.io.File;
import java.io.IOException;

public class WebFrontGenerator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Method with XSS vulnerability
    public String displayUserInput(String userInput) {
        return "<div>" + userInput + "</div>";
    }

    public double calculateCircleArea(double radius) throws IOException {
        File tempDir;
        tempDir = File.createTempFile("log_area", ".");
        tempDir.delete();
        tempDir.mkdir();
        return Math.PI * radius * radius;
    }
}
