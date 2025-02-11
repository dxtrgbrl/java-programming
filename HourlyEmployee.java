// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.

public class HourlyEmployee extends Employee 
{
   private double wage; // wage per hour
   private double hours; // hours worked for week

   // eight-argument constructor
   public HourlyEmployee( String first, String last, String ssn, 
      int month, int day, int year, 
      double hourlyWage, double hoursWorked )
   {
      super( first, last, ssn, month, day, year );
      setWage( hourlyWage );
      setHours( hoursWorked );
   } // end eight-argument HourlyEmployee constructor

   // set wage
   public void setWage( double hourlyWage )
   {
      if ( hourlyWage >= 0.0 )
         wage = hourlyWage;
      else
         throw new IllegalArgumentException( 
            "Hourly wage must be >= 0.0" );
   } // end method setWage

   // return wage
   public double getWage()
   {
      return wage;
   } // end method getWage

   // set hours worked
   public void setHours( double hoursWorked )
   {
      if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
         hours = hoursWorked;
      else
         throw new IllegalArgumentException( 
            "Hours worked must be >= 0.0 and <= 168.0" );
   } // end method setHours

   // return hours worked
   public double getHours()
   {
      return hours;
   } // end method getHours

   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      if ( getHours() <= 40 ) // no overtime
         return getWage() * getHours();
      else
         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
   } // end method earnings

   // return String representation of HourlyEmployee object
   @Override
   public String toString()
   {
      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "hourly wage", getWage(), 
         "hours worked", getHours() );
   } // end method toString
} // end class HourlyEmployee


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
