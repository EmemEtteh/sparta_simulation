package com.sparta.jungle;

public class TraineeManager {

    private static int totalTrainees = 0;
    private static int allocatedTrainees = 0;

    public static void setTotalTrainees(int numberOfMonths) {
        for (int i = 0; i <= numberOfMonths; i++) {
            totalTrainees += RandomGenerator.getRandomTrainees();
        }
    }

    public static int getTotalTrainees() {
        return totalTrainees;
    }

    public static int getAllocatedTrainees() {
        return allocatedTrainees;
    }

    public static void setAllocatedTrainees(int numberOfMonths) {
        for (int i = 0; i <= numberOfMonths; i++ ) {
            allocatedTrainees += RandomGenerator.getRandomCentreIntake();
        }
    }
}
