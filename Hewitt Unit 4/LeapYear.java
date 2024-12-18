
/**
 * This program will decide if a year input by the user is a leap year or not.
 *
 * @author Gavin Hewitt
 * @version 11/13/2020
 */

import java.util.*;

public class LeapYear
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Please enter a year: ");
       int year = scan.nextInt();
       
       if(year < 1582)
       {
           System.out.println("The Gregorian calender did not exist.");
       } else if ((year % 4) != 0)
       {
           System.out.println("The year " + year + " is not a leap year.");
       } else if ((year % 4) == 0)
       {
           if ((year % 100) != 0)
           {
               System.out.println("The year " + year + " is a leap year!");
           } else if(((year % 100) == 0) && ((year % 400) == 0))
           {
               System.out.println("The year " + year + " is a leap year!");
           } else
           {
               System.out.println("The year " + year + " is not a leap year.");
           }
       }
   }
}
