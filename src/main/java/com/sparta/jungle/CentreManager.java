package com.sparta.jungle;

public class CentreManager {

    private static int centres;
    private static int maxCapacity;

    private static int fullCentres;

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

    public static int getFullCentres(){
        return fullCentres;
    }

    public static void setFullCentres(int totalIntakeTrainees){
        fullCentres =  totalIntakeTrainees / 100;
    }
}
