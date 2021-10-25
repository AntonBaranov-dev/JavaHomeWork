package com.pb.baranov.hw3;

import java.util.Random;
import java.util.Scanner;


public class Bingo {
    private static final Scanner input = new Scanner(System.in);
    private static final int randomNumber = new Random().nextInt(101);
    private static int attempt = 0;

    public static void main(String[] args) {
        print("Hi i am a bingo game. Guess number");
        print("Enter value:");
        process();
    }

    private static void process() {
        Object value = input.next();

        try {
            if (randomNumber == Integer.parseInt(value.toString())) {
                print("The number is guessed!!!");
                print("Count attempt - " + attempt);
                System.exit(0);
            } else if (randomNumber > Integer.parseInt(value.toString())) {
                print("The number is greater");
            } else {
                print("The number is less");
            }
            attempt++;
            process();
        } catch (NumberFormatException ex) {
            if ("quit".equals(value)) {
                System.exit(0);
            } else {
                print("Enter number");
                process();
            }
        }
    }

    private static <T> void print(T t) {
        System.out.println(t);
    }
}
