package AirConditionerTestSamsuung;

import AirConditioner.AirConditioner;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    private final AirConditioner  SamsungAc;

    public AirConditionerTest(AirConditioner samsungAc) {
        SamsungAc = samsungAc;
    }

    @Test
     public void checkIfAcCanBeTurnedOnTest() {
     AirConditioner SamsungAc = new AirConditioner("Samsung new Generator", 16);
        boolean var = SamsungAc.checkturnedOn();
        assertTrue(var);
    }
    @Test
    public void checkIfaAcCanBeTurnedOffTest() {
        AirConditioner SamsungAc = new AirConditioner("Samasung new Generator", 0);
        boolean var = SamsungAc.checkTurnedOff();
        assertFalse();
    }

    private void assertFalse() {
    }
    @Test
    public  void checkIfAcCanBeIncreaseTest() {
        AirConditioner SamsungAc = new AirConditioner("Samsung new Generator",17 );

    }
    @Test
    public void changeTemperature() {
        AirConditioner samsungAc = new AirConditioner("Samsung new Generator", 20);
        int temperature = SamsungAc.increaseTemperatureNow();
        assertEquals(20,21);
    }

}
