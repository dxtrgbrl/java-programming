// GCS Exercise 10.1 Solution: DrawPanel.java
// Program randomly draws shapes.
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private Random randomNumbers = new Random();
   private MyShape[] shapes; // array containing all the shapes
   private int[] shapeCount; // statistic on the number of each shape
   
   // String containing shape statistic information
   private String statusText;
   
   // constructor that takes in the number of shapes
   public DrawPanel( int numberShapes )
   {
      setBackground( Color.WHITE );
      
      shapes = new MyShape[ numberShapes ];
      shapeCount = new int[ 3 ];

      for ( int i = 0; i < shapes.length; i++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 450 );
         int x2 = randomNumbers.nextInt( 450 );
         int y1 = randomNumbers.nextInt( 450 );
         int y2 = randomNumbers.nextInt( 450 );
         
         // generate a random color
         Color color = new Color ( randomNumbers.nextInt( 256 ),
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );

         // get filled property
         boolean filled = randomNumbers.nextBoolean();

         int shapeType = randomNumbers.nextInt( 3 );
         ++shapeCount[ shapeType ];

         switch ( shapeType )
         {
            case 0: // line
               shapes[ i ] = new MyLine( x1, y1, x2, y2, color );
               break;
            case 1: // oval
               shapes[ i ] = new MyOval( x1, y1, x2, y2, color, filled );
               break;
            case 2: // rectangle
               shapes[ i ] = 
                  new MyRectangle( x1, y1, x2, y2, color, filled );
               break;
         } // end switch
      } // end for
      
      // create string for the status bar label
      statusText = String.format( " %s: %d, %s: %d, %s: %d",
         "Lines", shapeCount[ 0 ], "Ovals", shapeCount[ 1 ],
         "Rectangles", shapeCount[ 2 ] );
   } // end DrawPanel constructor

   // returns a label containing shape statistics for this panel
   public String getLabelText()
   {
      return statusText;
   } // end method getLabelText
   
   // draw shapes using polymorphism
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      for ( MyShape shape : shapes )
         shape.draw( g );
   } // end method paintComponent
} // end class DrawPanel


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
