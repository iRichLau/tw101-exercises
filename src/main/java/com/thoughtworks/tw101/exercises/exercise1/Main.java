package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if ((i % 2 != 0)) {
                oddNumbers.add(i);
            }
        }
        for (int i : oddNumbers) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
