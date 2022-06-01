package com.sparta.jungle;

public class  WaitingList {
    private static int traineesWaiting;

    public static int getTraineesWaiting() {
        return traineesWaiting;
    }

    public static void setTraineesWaiting(int traineesWaiting) {
        WaitingList.traineesWaiting = traineesWaiting;
    }
}
