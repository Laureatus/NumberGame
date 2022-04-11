package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    int counter = 0;
    int highscore = 0;


    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            System.out.println("Choose you difficulty");
            Scanner scan = new Scanner(System.in);
            int difficulty = scan.nextInt();
            Number number = new Number();
            int wantedNum = number.createNumber(difficulty);
            System.out.println(wantedNum);
            boolean isFound = true;
            while (isFound) {
                System.out.println("Guess the Number");
                int guessedNum = scan.nextInt();
                if (guessedNum > wantedNum) {
                    System.out.println("The number you chose is too high");
                }
                if (guessedNum < wantedNum) {
                    System.out.println("The number you chose is too low");
                }
                if (guessedNum == wantedNum) {
                    System.out.println("You found the number");
                    isFound = false;
                }
            }
            System.out.println("Play agian?  Y | N");
            String answer = scan.next();
            if(answer.equals("N")) {
                cont = false;
            }
        }


    }
}
