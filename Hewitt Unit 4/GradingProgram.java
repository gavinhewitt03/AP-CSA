
/**
 * This program will determine a letter grade based on a percentage.
 *
 * @author Gavin Hewitt
 * @version 11/29/2020
 */

import java.util.*;

public class GradingProgram
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Would you like to enter a grade? (y/n) ");
       String ans = scan.nextLine();
       
       while(ans.equalsIgnoreCase("y"))
       {
           System.out.print("Please enter a grade (integer) : ");
           int grade = scan.nextInt();
           
           String junk = scan.nextLine();
           
           if(grade >= 90)
           {
               System.out.println("The letter grade is an A.");
           } else if (grade >= 80)
           {
               System.out.println("The letter grade is a B.");
           } else if (grade >= 70)
           {
               System.out.println("The letter grade is a C.");
           } else if (grade >= 60)
           {
               System.out.println("The letter grade is a D.");
           } else
           {
               System.out.println("The letter grade is an F.");
           }
           
           System.out.print("Would you like to enter another grade? (y/n) ");
           ans = scan.nextLine();
       }
       
       System.out.println("Have a nice day!");
   }
}
