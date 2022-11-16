package AirConditioner;

public class AirConditioner {
    private final boolean turnon = true;
    private int temperature;

    public AirConditioner(String acName, int temperature) {
        this.temperature = temperature;
    }


    public boolean checkturnedOn() {
        return turnon;
    }


    public boolean checkTurnedOff() {
        return  false;
    }

    public void increaseTemperature() {
        temperature++;

    }
    public  int validateTemperature(boolean mode) {
        boolean mode1 = mode;
        mode = true;

        if (turnon)
            temperature = 16;
        return temperature;
    }
    public int increaseTemperatureNow() {
        increaseTemperature();
        increaseTemperature();
        increaseTemperature();
        increaseTemperature();


        return 0;
    }
}
