package com.sparta.jungle;

import java.util.random.RandomGenerator;

public class Simulator
{
    private int months;
    private int totalTrainees;
    private int allocatedTrainees;
    private int centres;
    private int totalIntakeTrainees;
    private int waitingList;
    private int fullCentres;
    public Simulator() {

        UserInput userInput = new UserInput();
        months = userInput.getMonths();
        totalTrainees = TraineeManager.getTotalTrainees(months);

        CentreManager.setCentres(months);
        centres = CentreManager.getCentres();

        TraineeManager.setAllocatedTrainees(months);
        totalIntakeTrainees = TraineeManager.getAllocatedTrainees();

        WaitingList.setTraineesWaiting(totalTrainees - totalIntakeTrainees);
        waitingList = WaitingList.getTraineesWaiting();

        CentreManager.setFullCentres(totalIntakeTrainees);
        fullCentres = CentreManager.getFullcentres();

        Output.printReport(months, centres, fullCentres, totalIntakeTrainees, waitingList);

    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getTotalTrainees() {
        return totalTrainees;
    }

    public void setTotalTrainees(int totalTrainees) {
        this.totalTrainees = totalTrainees;
    }

    public int getAllocatedTrainees() {
        return allocatedTrainees;
    }

    public void setAllocatedTrainees(int allocatedTrainees) {
        this.allocatedTrainees = allocatedTrainees;
    }

    public int getCentres() {
        return centres;
    }

    public void setCentres(int centres) {
        this.centres = centres;
    }

    public int getTotalIntakeTrainees() {
        return totalIntakeTrainees;
    }

    public void setTotalIntakeTrainees(int totalIntakeTrainees) {
        this.totalIntakeTrainees = totalIntakeTrainees;
    }

    public int getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(int waitingList) {
        this.waitingList = waitingList;
    }

    public int getFullCentres() {
        return fullCentres;
    }

    public void setFullCentres(int fullCentres) {
        this.fullCentres = fullCentres;
    }

    public static void main(String[] args )
    {
        new Simulator();
    }
}
