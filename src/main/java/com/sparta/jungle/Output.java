package com.sparta.jungle;

public class Output {

    public static void  printReport(int months, int openCentres, int fullCentres, int allocatedTrainees, int traineesWaiting) {
        System.out.println("-- SPARTA TRAINEE REPORT --");
        System.out.println("Breakdown after " + months + " months:");
        System.out.println("Number of open centres: " + openCentres);
        System.out.println("Number of full centres: " + fullCentres);
        System.out.println("Number of Trainees currently in training: " + allocatedTrainees);
        System.out.println("Number of trainees on waiting list: " + traineesWaiting);

    }

}
