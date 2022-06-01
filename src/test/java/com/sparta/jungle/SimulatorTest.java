package com.sparta.jungle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




/**
 * Unit test for simple App.
 */
public class SimulatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Assert true")
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Assert Simulator gets and sets months")
    public void setAndGetMonthsFromSimulator() {
        Simulator.setMonths(5);
        assertEquals(5, Simulator.getMonths());
    }

    @Test
    @DisplayName("Assert Simulator gets and sets totalTrainees")
    public void setAndGetTotalTraineesFromSimulator() {
        Simulator.setTotalTrainees(5);
        assertEquals(5, Simulator.getTotalTrainees());
    }

    @Test
    @DisplayName("Assert Simulator gets and sets allocatedTrainees")
    public void setAndGetAllocatedTraineesFromSimulator() {
        Simulator.setAllocatedTrainees(5);
        assertEquals(5, Simulator.getAllocatedTrainees());
    }



}
