package com.pb.baranov.hw3;

import java.util.*;

public class Array {
    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        print("Hi i am a bubble array sort program.");
        print("Enter 10 numbers.");
        process();
    }

    private static void process() {
        print("Enter value:");
        for (int i = 0; i < 10; i++){
            list.add(new Scanner(System.in).nextInt());
        }
        print(list);

        int[] arr = new int[list.size()];
        int arrSum = 0;
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
            arrSum += list.get(i);
        }
        print(arrSum);

        int countPositiveNumbers = 0;
        for (int j : arr) {
            if (j > 0) {
                countPositiveNumbers++;
            }
        }
        print(countPositiveNumbers);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        print(Arrays.toString(arr));
    }

    private static <T> void print(T t) {
        System.out.println(t);
    }
}
