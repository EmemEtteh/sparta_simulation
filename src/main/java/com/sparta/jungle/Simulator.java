package com.sparta.jungle;

public class Simulator
{
    private int months;
    private int totalTrainees;
    private int allocatedTrainees;
    private int centres;
    private int waitingList;
    private int maxCapacity;
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

        CentreManager.setMaxCapacity(months);
        maxCapacity = CentreManager.getMaxCapacity();

        CentreManager.setFullCentres(allocatedTrainees);
        fullCentres = CentreManager.getFullCentres();

        Output.printReport(months, centres, fullCentres, allocatedTrainees, waitingList);

    }


    public static void main(String[] args )
    {
        new Simulator();
    }
}
