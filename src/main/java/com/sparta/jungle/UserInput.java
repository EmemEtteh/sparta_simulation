package com.sparta.jungle;

import java.util.Scanner;

public class UserInput {



    public static int getMonths() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of months to simulate: ");
        int months = Integer.parseInt(userInput.nextLine());
        return months;
    }
}
