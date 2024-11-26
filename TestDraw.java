// GCS Exercise 10.1 Solution: TestDraw.java
// Test application to display a DrawPanel
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class TestDraw
{
   public static void main( String[] args )
   {
      // Ask the user to enter the number of shapes
      int shapes = Integer.parseInt(
         JOptionPane.showInputDialog( "Number of shapes" ) );
      
      DrawPanel panel = new DrawPanel( shapes );      
      JFrame application = new JFrame();
      
      // Create a label containing the shape information
      JLabel statusLabel = new JLabel( panel.getLabelText() );
      
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      application.add( panel ); // add drawing to CENTER by default
      // Add the status label to the SOUTH (bottom) of the frame
      application.add( statusLabel, BorderLayout.SOUTH );
      
      application.setSize( 500, 500 );
      application.setVisible( true );
   } // end main
} // end class TestDraw

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
