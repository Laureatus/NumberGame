package com.company;

import java.util.Random;

public class Number {
    public int createNumber(int difficulty) {
        Random rand = new Random();
        return(rand.nextInt(difficulty));
    }
}
