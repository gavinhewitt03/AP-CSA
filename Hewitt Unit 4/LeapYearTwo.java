
/**
 * This program allows the user to enter more than one year to test if it is a leap year.
 *
 * @author Gavin Hewitt
 * @version 11/16/2020
 */

import java.util.*;

public class LeapYearTwo
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("This program will allow you to test if a year is a leap year or not.");
       System.out.print("Would you like to enter a year? (y/n) ");
       String ans = scan.nextLine();
       
       if(ans.equalsIgnoreCase("y"))
       {
           while(ans.equalsIgnoreCase("y"))
           {
               System.out.print("Please enter a year: ");
               int year = scan.nextInt();
               
               if((year % 4) != 0)
               {
                   System.out.println("The year " + year + " is not a leap year.");
               } else if((year % 4) == 0)
               {
                   if((year % 100) != 0)
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
               
               String junk = scan.nextLine();
                   
               System.out.print("Would you like to enter another year? (y/n) ");
               ans = scan.nextLine();
           }
       }
       
       System.out.println("Goodbye!");
   }
}
