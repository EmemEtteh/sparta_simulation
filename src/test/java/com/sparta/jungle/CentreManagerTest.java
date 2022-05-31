package com.sparta.jungle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CentreManagerTest {
    @Test
    @DisplayName("Check get and set centres")
    public void checkGetAndSetCentres() {
        CentreManager.setCentres(4);
        Assertions.assertEquals(4, CentreManager.getCentres());
    }

    @Test
    @DisplayName("Check get and set centres")
    public void checkGetAndSetCentres() {
        CentreManager.setCentres(4);
        Assertions.assertEquals(4, CentreManager.getCentres());
    }
    @Test
    @DisplayName("Check get full centres")
    public void checkGetFullCentres() {
        CentreManager.setCentres(4);
        Assertions.assertEquals(4, CentreManager.getCentres());
    }

}