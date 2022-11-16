package UIUX;

import javax.swing.*;

public class ConfirmOption {

    public static class JExample {

        public static void main(String[] args) {
            /* JOptionPane Java user input example */
            var yesOrNo = JOptionPane.showConfirmDialog(null, "Are you engaged or not?");
            if (yesOrNo == 0) {
                JOptionPane.showMessageDialog(null, "You chose yes!");
            }else if (yesOrNo == 1) {
                JOptionPane.showMessageDialog(null, "You chose no.");
            }else if
             (yesOrNo == 2) {
                JOptionPane.showMessageDialog(null, "You chose to cancel!");
            }
        }
    }

}
