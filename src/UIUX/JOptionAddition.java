package UIUX;

import javax.swing.JOptionPane;

public class JOptionAddition {

    public static void main(String[] args) {

        String firstNumber = JOptionPane.showInputDialog("Input <First Integer>");

        String secondNumber = JOptionPane.showInputDialog("Input <Second Integer>");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "Sum is " + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}