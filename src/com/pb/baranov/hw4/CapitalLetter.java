package com.pb.baranov.hw4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CapitalLetter {
    private static final Scanner input = new Scanner(System.in);
    private static final String separator = " ";

    public static void main(String[] args) {
        System.out.println("Hi i am a Capital Letter program");
        System.out.println("Enter text:");
        process();
    }

    private static void process() {
        String inputStr = input.nextLine();
        List<String> strings = Arrays.stream(inputStr.split(separator)).collect(Collectors.toList());
        strings.forEach(str -> str = Character.toUpperCase(str.charAt(0)) + str.substring(1));
        List<String> toUpperCaseStrings = strings.stream().map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1)).collect(Collectors.toList());
        System.out.println(String.join(" ", toUpperCaseStrings));
    }
}
