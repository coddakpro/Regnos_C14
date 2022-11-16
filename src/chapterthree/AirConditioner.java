package chapterthree;

public class AirConditioner {
    private String name;
    private boolean turnon = true;
    private int temperature;
    private boolean mode;

    public AirConditioner(String acName, int temperature) {
        name = acName;
        this.temperature = temperature;
    }


    public boolean checkTurnedOn() {
        return turnon;
    }


    public boolean checkTurnedOff() {
        return  false;
    }

    public int increaseTemperature() {
        return temperature++;

    }
    public  int validateTemperature(boolean mode) {
        this.mode = mode;
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

