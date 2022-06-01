package com.sparta.jungle;
import java.util.Random;



public class RandomGenerator {

    public static int getRandomTrainees(){

        Random random = new Random();
        int minTrainees = 50;
        int maxTrainees = 101;

        int randomNumberOfNewTrainees = random.nextInt(maxTrainees - minTrainees) + minTrainees;
        return randomNumberOfNewTrainees;
    }

    public static int getRandomCentreIntake(){
        Random random = new Random();
        int minTrainees = 1;
        int maxTrainees = 52;

        int randomNumberOfIntookTrainees = random.nextInt(maxTrainees);
        return randomNumberOfIntookTrainees -1;
    }
    public static int getRandomCentreIntake(int maxTrainees){
        if (maxTrainees != 0) {
            Random random = new Random();
            int minTrainees = 0;
            if (maxTrainees > 50) {
                maxTrainees = 51;
            }

            int randomNumberOfIntookTrainees = random.nextInt(maxTrainees);
            return randomNumberOfIntookTrainees;
        } else return 0;
    }


}


