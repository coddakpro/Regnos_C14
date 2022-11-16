package UIUX;

import javax.swing.JOptionPane;


public class UiuxCode
{
   public static void main(String[] args)
   {
      String input;     // To hold String input.
      // int    length;    // To hold length.
     // int    width;     // To hold width.
    // int    area;      // To hold area.

      // Prompt user to input length.
      input = JOptionPane.showInputDialog("Enter Length");

      // Convert the String input to an int.
     int length = Integer.parseInt(input);

      // Prompt user to input width.
      input = JOptionPane.showInputDialog("Enter Width");

      // Convert the String input to an int.
     int width = Integer.parseInt(input);

      // Calculate area of rectangle.
     int area = length * width;

      // Display area of rectangle.
      JOptionPane.showMessageDialog(null,
                                    "Area of rectangle is " + area);
   }
}