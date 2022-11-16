package chapterthree;

import javax.swing.*;

public class NameDialog {
    public static void main(String... args) {
        String name = JOptionPane.showInputDialog("hello");
        String message = String.format("%s, Welcome, to java programming", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
