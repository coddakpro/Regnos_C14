package chapterthree;

import javax.swing.JOptionPane;

public class RectangleTest
{
   public static void main(String[] args)
   {
      
      // Prompt user to input length.
     String input = JOptionPane.showInputDialog("Enter Length");

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