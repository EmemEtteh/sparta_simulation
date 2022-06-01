package com.sparta.jungle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TraineeManagerTest {
    @Test
    @DisplayName("Assert TraineeManager gets and sets allocated trainees")
    public void CheckSetAndGetAllocatedTraineesFromTraineeManager() {
        TraineeManager.setAllocatedTrainees(5);
        Assertions.assertEquals(5, TraineeManager.getAllocatedTrainees());
    }
}