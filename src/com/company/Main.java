package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    int counter = 0;
    int highscore = 0;


    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose you difficulty");
            while (!scan.hasNextInt()) {
                System.out.println("Thats not a number please try again");
                scan.next();
            }
            int difficulty = scan.nextInt();
            Number number = new Number();
            int wantedNum = number.createNumber(difficulty);
            Find find = new Find();
            find.findNumber(wantedNum);
            System.out.println("Play agian?  Y | N");
            String answer = scan.next();
            if(answer.equals("N")) {
                cont = false;
            }
        }


    }
}
