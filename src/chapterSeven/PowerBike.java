package chapterSeven;


public class PowerBike {
    public int changeGear;
    private String name;
    private int speed;
    private boolean isOn;
    private final boolean brake = true;
    private int gear;


    public PowerBike(String name) {
        this.name = name;
        this.isOn = false;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGear() {
        return gear;
    }

    public int setGear(int GearNumber) {

        if (speed != 0) {
            gear = 0;
        }
        if (speed <= 41) {
            gear = 4;
        }
            if (isOn) {
                if (gear == 1) {
                    speed++;
                } else if (gear == 2){
                    speed +=2;
                }else if (gear ==3){
                    speed +=3;
                }
                else if (gear ==4){
                    speed +=4;
                }
            }

        {
             String powerStatus = isOn ? "turned on" : "turned off";
            System.out.println(name + "jinchang is currently" + powerStatus);
        }
        boolean getSpeed;{
             return 0;
        }
    }

    public void Acceleration(){

    }

    public boolean checkTurnOn() {
        return true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void isOff() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;

    }

    public boolean changeGear() {
        return true;

    }

    public boolean accelerateSpeed() {
    return true;
    }

    public void setChangeGear(int changeGear) {
        this.changeGear = changeGear;
    }

    public boolean isBrake() {
        boolean brake = this.brake;
        return brake;
    }

    public int getSpeed() {
        int speed = this.speed;
        return speed;
    }

    public int decelerateSpeed() {
        return 0;
    }


    public int setGear() {
        return 0;
    }
}

