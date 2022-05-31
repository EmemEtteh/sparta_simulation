package com.sparta.jungle;

public class TraineeManager {

    public static int totalTrainees = 0;
    public static int allocatedTrainees = 0;

    public static void main(String[] args) {
        setAllocatedTrainees(20);
        System.out.println(getAllocatedTrainees());
    }

    public static void getTotalTrainees(int numberOfMonths) {
        for (int i = 0; i <= numberOfMonths; i++) {
            totalTrainees += RandomGenerator.getRandomTrainees();
        }
    }

    public static int getAllocatedTrainees() {
        return allocatedTrainees;
    }

    public static void setAllocatedTrainees(int numberOfMonths) {
        for (int i = 0; i <= numberOfMonths; i++ ) {
            allocatedTrainees += RandomGenerator.getRandomCentreIntake;
        }
    }
}
