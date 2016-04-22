package com.thoughtworks.tw101.exercises.exercise7;


import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int answer;
    private Scanner reader;
    private PrintStream out;
    private Random random;

    public Game(Scanner reader, PrintStream out, Random random){
        this.reader = reader;
        this.out = out;
        this.random = random;

        greeter();
        chooseAnswer();
        takeGuess();
    }

    public void greeter(){
        System.out.println("Welcome to the Number Guessing Game. Choose a number between 1 and 100.");
    }

    public void chooseAnswer() {
        this.answer = random.nextInt(100) + 1;
    }

    public void takeGuess() {
        while(true) {
            out.println("Enter A Guess: ");
            int guess = reader.nextInt();
            if(correctGuess(guess)){
                break;
            }
        }
    }

    public boolean correctGuess(int guess){
        if (guess > answer) {
            out.println("You guessed too high");
            return false;
        } else if (guess < answer) {
            out.println("You guessed too low");
            return false;
        } else {
            out.println("You win! The number is " + answer);
            return true;
        }
    }
}
