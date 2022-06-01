package com.sparta.jungle;

public class Centre {

    private int numberOfTrainees = 0;
    private int maxCapacity = 100;
    private boolean isFull = false;

    public Centre(int numberOfTrainees) {
        this.numberOfTrainees = numberOfTrainees;
    }

    public int getEmptySpaces(){
        return maxCapacity - numberOfTrainees;
    }

    public void addTraineesToCentre(int traineesToAdd){
        int temp = numberOfTrainees + traineesToAdd;
        if (temp < 100) {
            numberOfTrainees += traineesToAdd;
        } else if (temp == 100){
            numberOfTrainees += traineesToAdd;
            setFull(true);
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setNumberOfTrainees(int numberOfTrainees) {
        this.numberOfTrainees = numberOfTrainees;
    }

    public int getNumberOfTrainees() {
        return numberOfTrainees;
    }



}
