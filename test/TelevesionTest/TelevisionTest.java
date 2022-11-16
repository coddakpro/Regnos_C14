package TelevesionTest;

import Assignments.Televesion;
import Assignments.Television;

import org.junit.Test;

import static Assignments.Television.turnOn;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {
    public final Object SonyTv;

    public TelevisionTest(Object sonyTv) {
        SonyTv = sonyTv;
    }

    @Test
    public void checkIfTelevisionCanBeTurnedOn(){
        Television sonyTv = new Television("Sony New Generator");
        boolean var = sonyTv.checkTurnOn();
        assertTrue();
    }

    private void assertTrue() {
    }

    @Test
    public void checkIfTelevisionCanBeTurnedOff(){
        Television sonyTv = new Television("Sony New Generator");
        try {
            boolean var = (boolean) SonyTv;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void changeChannelStation(){
        Television sonyTv = new Television("Sony New Generator");
        assertEquals(1, sonyTv.changeChannelStationNow());
    }
    @Test
    public  void changeSearchStation(){
        Television sonyTv = new Television("Sony New Generator");

    }
    @Test
    public  void checkIfTelevisionStationCanBeChanged(){
        Televesion sonyTv = new Televesion("Sony New generator");
    }
        Television television = new Television("Sony New Generator");

    @Test
    public void checkIfTelevisionColourCanBeChange(){
        Television sonyTv = new Television("Sony New Generator");
    }


    @Test
    public  void checkIfTelevisionSoundCanBeOn(){
        Television sonyTv= new Television("Sony New Generator");
    }


    @Test
    public void checkIfTelevisionVolumeCanBeOff(){
        Television sonyTv = new Television("television New Generator");
    }


    @Test
    public  void checkIfVolumeCanBeIncreasedAbove50(){
        Television sonyTv= new Television("Television New Generator");
        assertEquals(50, sonyTv.increaseSoundNow());
        assertTrue();
    }
    @Test
    public  void  checkIfTelevesionVolumeCanBeReduced(){
        Television sonyTv = new Television("sony new Generator");
        turnOn();}


}

