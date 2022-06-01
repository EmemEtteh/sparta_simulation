package com.sparta.jungle;

import java.util.ArrayList;

public class CentreManager {

    private static int centres;
    private static int maxCapacity;
    private static int fullCentres;
    private static ArrayList<Centre> listOfCentres = new ArrayList<>();

    public static int getCentres() {
        return centres;
    }
    public static void setCentres(int months){
        centres = months / 2;
    }

    public static int getMaxCapacity(){
        return maxCapacity;
    }
    public static void setMaxCapacity(){
        maxCapacity = centres * 100;
    }

    public static void setFullCentres(int totalIntakeTrainees){
        fullCentres =  totalIntakeTrainees / 100;
    }

    public static void addCentreToArray(){
            listOfCentres.add(new Centre(0));
    }

    public static void addTraineesToCentres(int traineesToAdd){
        int storedTrainees = traineesToAdd;

        if (!WaitingList.isEmpty()){
            storedTrainees += WaitingList.getTraineesWaiting();
        }
        for (Centre centre : listOfCentres){
            if (!centre.isFull()){
                storedTrainees = getStoredTrainees(storedTrainees, centre);
            }
            WaitingList.setTraineesWaiting(storedTrainees);
        }
    }

    private static int getStoredTrainees(int storedTrainees, Centre centre) {
        int emptySpaces = centre.getEmptySpaces();
        int traineesToAllocate = 0;
        if (emptySpaces < 50 || storedTrainees < 50){
            if (emptySpaces < storedTrainees){
                traineesToAllocate = RandomGenerator.getRandomCentreIntake(emptySpaces);
            } else traineesToAllocate = RandomGenerator.getRandomCentreIntake(storedTrainees);
        } else traineesToAllocate = RandomGenerator.getRandomTrainees();
        centre.addTraineesToCentre(traineesToAllocate);
        storedTrainees -= traineesToAllocate;
        return storedTrainees;
    }

    public static ArrayList<Centre> getListOfCentres() {
        return listOfCentres;
    }
}
