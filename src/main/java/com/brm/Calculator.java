package com.brm;

public class Calculator {

    private CalculatorFunctions calculatorFunctions;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.doCalculations();
    }

    private void doCalculations() {
        this.calculatorFunctions = new CalculatorFunctions();
        performAddition();
        performSubtraction();
        performMultiplication();
        performDivision();
        performSquareRoot();
    }

    private void performAddition() {
        System.out.println("\nAdding the number 10 to 15...");
        System.out.println(this.calculatorFunctions.add(10, 15));
    }

    private void performSubtraction() {
        System.out.println("\nSubtracting the number 10 from 90...");
        System.out.println(this.calculatorFunctions.subtract(90, 10));
    }

    private void performMultiplication() {
        System.out.println("\nMultiplying the number 10 by 12...");
        System.out.println(this.calculatorFunctions.multiply(10, 12));
    }

    private void performDivision() {
        System.out.println("\nDividing the number 90 by 2...");
        System.out.println(this.calculatorFunctions.divide(90, 2));
    }

    private void performSquareRoot() {
        System.out.println("\nTaking the square root of 400...");
        System.out.println(this.calculatorFunctions.squareRoot(400));
    }
}