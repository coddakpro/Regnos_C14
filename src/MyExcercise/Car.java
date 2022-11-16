package MyExcercise;

public class Car {

    private int wheels;
    private int doors;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("Carrera") || validModel.equals("EvilSpirit")) {
            this.model = model;
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return  this.model;
    }
}
