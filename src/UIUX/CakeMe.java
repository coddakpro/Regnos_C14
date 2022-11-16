package UIUX;

import javax.swing.*;

public class CakeMe {

            public static void main(String... args) {
                /* JOptionPane Java user input example */
                String[] options = { "eba", "rice", "amala" };
                var dessert = JOptionPane.showOptionDialog(null, "List of foods?", "Select anyone:",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (dessert == 0) {
                    JOptionPane.showMessageDialog(null, "Are You sure you choose eba!");
                    JOptionPane.showConfirmDialog(null, "Confirm your order");
                }
                if (dessert == 1) {
                    JOptionPane.showMessageDialog(null, "You chose rice.");
                    JOptionPane.showConfirmDialog(null, "Confirm your order");

                }
                if (dessert == 2) {
                    JOptionPane.showMessageDialog(null, "You chose amala!");
                    JOptionPane.showConfirmDialog(null, "Confirm your order");

                }
            }
        }
