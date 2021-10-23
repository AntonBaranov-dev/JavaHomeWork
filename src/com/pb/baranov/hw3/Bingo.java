package com.pb.baranov.hw3;

import java.util.Random;
import java.util.Scanner;


public class Bingo {
    private static final Scanner input = new Scanner(System.in);
    private static final int randomNumber = new Random().nextInt(101);
    private static int attempt = 0;

    public static void main(String[] args) {
        print("Hi i am a bingo game. Guess number");
        process();
    }

    private static void process() {
        print("Enter value:");
        int value = input.nextInt();

        if (randomNumber == value) {
            print("The number is guessed!!!");
            print("Count attempt - " + attempt);
            System.exit(0);
        } else if (randomNumber > value) {
            print("The number is greater");
        } else {
            print("The number is less");
        }
        attempt++;
        process();
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
