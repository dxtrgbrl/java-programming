// Exercise 10.13: Building.java
public class Building implements CarbonFootprint
{
   private int squareFeet;

   public Building( int sf )
   {
      squareFeet = sf;
   } // end Building constructor

   // Simplified formula: Multiply the square footage by 50
   // for the wood frame, by 20 for the basement,
   // by 47 for the concrete, and 17 for the steel
   // Note: The website where we got this information no longer exists.
   public void GetCarbonFootprint()
   {
      System.out.printf( "Building with %d square feet: %d\n", 
         squareFeet, squareFeet * ( 50 + 20 + 47 + 17 ) );
   } // end function GetCarbonFootprint   
}

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
