// Exercise 10.8 Solution: Employee.java
// Employee abstract superclass.

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthDate;

   // six-argument constructor
   public Employee( String first, String last, String ssn, 
      int month, int day, int year )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      birthDate = new Date( month, day, year );
   } // end six-argument Employee constructor

   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn;  // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber

   // set birth date
   public void setBirthDate( int month, int day, int year )
   {
      birthDate = new Date( month, day, year );
   } // end method setBirthDate

   // return birth date
   public Date getBirthDate()
   {
      return birthDate;
   } // end method getBirthDate

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format( "%s %s\n%s: %s\n%s: %s", 
         getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "birth date", getBirthDate() );
   } // end method toString

   // abstract method overridden by subclasses
   public abstract double earnings();
} // end abstract class Employee

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