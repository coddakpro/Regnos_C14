package MyExcercise;

public class CalculateDigits {

    private int number;

    public void  setNumber(int number) {
        if (number >= 0 && number <= 10) {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}