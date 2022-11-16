package UIUX;

import javax.swing.*;
import java.awt.event.ActionEvent;

public interface ButtonExamples {


        ButtonExamples b1 = new ButtonExamples() {
            private Object leftButtonIcon;



            @Override
            public void createImageIcon() {

            }

            /**
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            /**
             * @param b
             */
            @Override
            public void setEnabled(boolean b) {

            }
        };


        ButtonExamples b2 = new ButtonExamples() {

            private Object middleButtonIcon;



            /**
             *
             */
            @Override
            public void createImageIcon() {

            }

            /**
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            /**
             * @param b
             */
            @Override
            public void setEnabled(boolean b) {

            }
        };


    static ImageIcon createImageIcon(String s) {
        return null;
    }

    void createImageIcon();

    public default void actionPerformed(ActionEvent e) {
        Action b2 = null;
        Action b1 = null;
        Action b3 = null;
        if ("disable".equals(e.getActionCommand())) {
            assert false;
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            assert false;
            b2.setEnabled(true);
            assert false;
            b1.setEnabled(true);
            assert false;
            b3.setEnabled(false);
        }
    }

    void setEnabled(boolean b);
}

