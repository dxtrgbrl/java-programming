// Exercise 10.13: CarbonFootPrintTest.java
public class CarbonFootPrintTest
{
   public static void main( String[] args )
   {
      CarbonFootprint[] list = new CarbonFootprint[ 3 ];

      // add elements to list
      list[ 0 ] = new Bicycle();
      list[ 1 ] = new Building( 2500 );
      list[ 2 ] = new Car( 10 );
   
      // display carbon footprint of each object
      for ( int i = 0; i < list.length; i++ )
         list[ i ].GetCarbonFootprint();
   } // end main
} // end class CarbonFootPrintTest



/**************************************************************************
 * (C) Copyright 1992-2011 by Deitel & Associates, Inc. and               *
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
 **************************************************************************/
