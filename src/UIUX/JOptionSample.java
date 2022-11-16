package UIUX;

import javax.swing.JOptionPane;

public class JOptionSample {

    public static void main(String[] args) {

        String firstNumber = JOptionPane.showInputDialog("Input <First Integer>");

        String secondNumber = JOptionPane.showInputDialog("Input <Second Integer>");

        double number1;
        number1 = Integer.parseInt(firstNumber);
        double number2 = Integer.parseInt(secondNumber);
        double sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "Sum is" + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}