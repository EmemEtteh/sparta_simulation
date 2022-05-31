package com.sparta.jungle;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class WaitingListTest {
    @Test
    @DisplayName("Check if the waiting displays the number")
    void checkIfTheWaitingDisplaysTheNumber() {

        Assertions.assertEquals(4, WaitingList.getTraineesWaiting());
    }

    @Test
    @DisplayName("Check get and set trainees on waiting list")
    public void checkGetTraineesReturnsNumberOnWaitingList() {
        WaitingList.setTraineesWaiting(4);
        Assertions.assertEquals(4, WaitingList.getTraineesWaiting());
    }

}