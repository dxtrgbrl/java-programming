// GCS Exercise 10.1 Solution: MyOval.java
// Declaration of class MyOval.
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape
{
   private boolean filled; // whether this shape is filled
   
   // call default superclass constructor
   public MyOval()
   {
      super();
      setFilled( false );
   } // end MyOval no-argument constructor

   // call superclass constructor passing parameters
   public MyOval( int x1, int y1, int x2, int y2,
      Color color, boolean isFilled )
   {
      super( x1, y1, x2, y2, color );
      setFilled( isFilled );
   } // end MyOval constructor

   // get upper left x coordinate
   public int getUpperLeftX()
   {
      return Math.min( getX1(), getX2() );
   } // end method getUpperLeftX

   // get upper left y coordinate
   public int getUpperLeftY()
   {
      return Math.min( getY1(), getY2() );
   } // end method getUpperLeftY

   // get shape width
   public int getWidth()
   {
      return Math.abs( getX2() - getX1() );
   } // end method getWidth

   // get shape height
   public int getHeight()
   {
      return Math.abs( getY2() - getY1() );
   } // end method getHeight
   
   // determines whether this shape is filled
   public boolean isFilled()
   {
      return filled;
   } // end method isFilled
   
   // sets whether this shape is filled
   public void setFilled( boolean isFilled )
   {
      filled = isFilled;
   } // end method setFilled   
   
   // draw oval
   public void draw( Graphics g )
   {
      g.setColor( getColor() );
      
      if ( isFilled() )
         g.fillOval( getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight() );
      else
         g.drawOval( getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight() );
   } // end method draw
} // end class MyOval


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
