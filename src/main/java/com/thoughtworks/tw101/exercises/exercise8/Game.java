package com.thoughtworks.tw101.exercises.exercise8;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int answer;
    private Scanner reader;
    private PrintStream out;
    private Random random;
    private ArrayList<Integer> guesses;

    public Game(Scanner reader, PrintStream out, Random random){
        this.reader = reader;
        this.out = out;
        this.random = random;
        this.guesses = new ArrayList<Integer>();

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

    public void recordGuess(int guess){
        guesses.add(guess);
    }

    public void checkIfNumber(){
        while(!reader.hasNextInt()) {
            reader.next();
            out.println("Not a Number. Please Enter A Guess: ");
        }
    }
    public void takeGuess() {
        while(true) {
            out.println("Enter A Guess: ");

            checkIfNumber();

            int guess = reader.nextInt();
            recordGuess(guess);

            if(correctGuess(guess)){
                break;
            }
        }
    }

    public void winningOutput(){
        out.println("You win! The number is " + answer);
        out.println("Your previous guesses were:");
        for(Integer usedGuess : guesses) {
            out.println(usedGuess);
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
            winningOutput();
            return true;
        }
    }
}
