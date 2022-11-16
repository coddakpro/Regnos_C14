package MyExcercise;

public class MotorCycles {
    private String make;
    private String color;

    public static void main(String[] args) {
        MotorCycles m = new MotorCycles();
        m.make = "Yamaha RZ350";
        m.color = "Yellow";
        System.out.println("calling showAtts...");
        m.showAtts();
        System.out.println("________");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("________");
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("________");
        System.out.println("Starting engine...");
        m.startEngine();

    }

    private void startEngine() {
    }

    private void showAtts() {
    }
}
