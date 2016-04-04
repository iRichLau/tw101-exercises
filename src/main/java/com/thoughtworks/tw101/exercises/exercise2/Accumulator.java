package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int count = 0;

    void increment() {
        count += 1;
    }

    void total(){
        System.out.println("The total is: " + count);
    }
}
