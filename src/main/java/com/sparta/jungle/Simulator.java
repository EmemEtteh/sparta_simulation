package com.sparta.jungle;

import java.util.random.RandomGenerator;

public class Simulator
{
    private int months;
    private int totalTrainees;
    private int allocatedTrainees;
    private int centres;
    private int waitingList;
    private int fullCentres;
    public Simulator() {

        UserInput userInput = new UserInput();
        months = userInput.getMonths();

        TraineeManager.setTotalTrainees(months);
        totalTrainees = TraineeManager.getTotalTrainees();

        CentreManager.setCentres(months);
        centres = CentreManager.getCentres();

        TraineeManager.setAllocatedTrainees(months);
        allocatedTrainees = TraineeManager.getAllocatedTrainees();

        WaitingList.setTraineesWaiting(totalTrainees - allocatedTrainees);
        waitingList = WaitingList.getTraineesWaiting();

        CentreManager.setFullCentres(allocatedTrainees);
        fullCentres = CentreManager.getFullCentres();

        Output.printReport(months, centres, fullCentres, allocatedTrainees, waitingList);

    }


    public static void main(String[] args )
    {
        new Simulator();
    }
}
