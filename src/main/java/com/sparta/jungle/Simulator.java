package com.sparta.jungle;

import java.util.ArrayList;

public class Simulator
{
    private int months;
    private int allocatedTrainees = 0;
    private int centres = 0;
    private int waitingList;
    private int fullCentres = 0;

    public Simulator() {
        int userInput = UserInput.getUserInput();

        while (userInput == 1 ) {

          months = UserInput.getMonths();

          for (int i = 1; i <= months; i++){
              if (i % 2 == 0){
                  CentreManager.addCentreToArray();
              }

              int newTrainees = RandomGenerator.getRandomTrainees();
              CentreManager.addTraineesToCentres(newTrainees);
          }

          for (Centre centre : CentreManager.getListOfCentres()){
              if (centre.isFull()){
                  fullCentres++;
              }
              allocatedTrainees += centre.getNumberOfTrainees();
              centres++;
          }

          waitingList = WaitingList.getTraineesWaiting();

          Output.printReport(months, centres, fullCentres, allocatedTrainees, waitingList);

          centres = 0;
          fullCentres = 0;
          allocatedTrainees = 0;
          waitingList = 0;
          WaitingList.setTraineesWaiting(0);
          CentreManager.resetListOfCenters();

          userInput = UserInput.getUserInput();
        }
    }


    public static void main(String[] args )
    {
        new Simulator();
    }
}
