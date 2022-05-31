package com.sparta.jungle;
import java.util.Random;



public class RandomGenerator {

    public static int getRandomTrainees(){

        Random random = new Random();
        int minTrainees = 50;
        int maxTrainees = 100;

        int randomNumberOfNewTrainees = random.nextInt(maxTrainees - minTrainees) + minTrainees;
        return randomNumberOfNewTrainees;
    }

    public static int getRandomCentreIntake(){
        Random random = new Random();
        int minTrainees = 0;
        int maxTrainees = 50;

        int randomNumberOfIntookTrainees = random.nextInt(maxTrainees - minTrainees) + minTrainees;
        return randomNumberOfIntookTrainees;
    }


}


