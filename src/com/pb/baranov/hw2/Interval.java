package com.pb.baranov.hw2;

import java.util.Scanner;

public class Interval {
    private static int value;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi i am a interval determination program");
        process();
    }

    private static void process() {
        System.out.println("Enter value:");
        value = input.nextInt();

        if (0 <= value && value <= 14) {
            System.out.println("Result: value in interval [0-14]");
        } else if (15 <= value && value <= 35) {
            System.out.println("Result: value in interval [15-35]");
        } else if (36 <= value && value <= 50) {
            System.out.println("Result: value in interval [36-50]");
        } else if (51 <= value && value <= 100) {
            System.out.println("Result: value in interval [51-100]");
        } else {
            System.out.println("Result: value is not included in any interval");
        }

        process();
    }

}
