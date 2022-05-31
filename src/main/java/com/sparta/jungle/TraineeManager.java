package com.sparta.jungle;

public class TraineeManager {

    static int totalTrainees = 0;
    static int allocatedTrainees = 0;

    public static void main(String[] args) {
        getTotalTrainees(5);
    }

    public static void getTotalTrainees(int numberOfMonths) {
        for (int i = 0; i <= numberOfMonths; i++) {
            totalTrainees += getRandomTrainees();
        }
    }

    public static int getAllocatedTrainees() {
        return allocatedTrainees;
    }

    public static void setAllocatedTrainees(int calculatedAllocatedTrainees) {
        allocatedTrainees = calculatedAllocatedTrainees;
    }
}
