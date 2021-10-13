package com.pb.baranov.hw2;

import java.util.Scanner;

public class Calculator {
    private static int operand1;
    private static int operand2;
    private static String sign;
    private static final int ZERO = 0;

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi i am a calculator");
        process();
    }

    private static void process() {
        System.out.println("Enter value of operand1:");
        operand1 = input.nextInt();
        System.out.println("Enter value of operand2:");
        operand2 = input.nextInt();
        System.out.println("Enter arithmetic operation:");
        sign = input.next();
        calculate();
    }

    private static void calculate() {
        switch (sign) {
            case "+":
                System.out.println("Result: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Result: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Result: " + (operand1 * operand2));
            case "/":
                if (operand2 != ZERO) {
                    System.out.println("Result: " + (operand1 / operand2));
                } else {
                    System.out.println("ERROR: division by zero is not possible");
                }

        }
        process();
    }
}
