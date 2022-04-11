package com.company;

import java.util.Scanner;

public class Find {
    public void findNumber(int wantedNum) {
        Scanner scan = new Scanner(System.in);
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

    }
}
