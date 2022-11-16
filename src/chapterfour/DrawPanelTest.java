package chapterfour;

import javax.swing.*;

public class DrawPanelTest {
    public static void main(String[] args) {

        DrawPane1 panel = new DrawPane1();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
