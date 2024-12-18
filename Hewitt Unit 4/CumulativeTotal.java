
/**
 * This program reads positive integers from the user and prints cumulative totals.
 *
 * @author Gavin Hewitt
 * @version 11/18/2020
 */

import java.util.*;

public class CumulativeTotal
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       int sum = 0;
       
       System.out.print("Please enter a positive integer (negative to quit): ");
       int x = scan.nextInt();
       
       while(x > 0)
       {
           sum += x;
           System.out.println("Cumulative Total: " + sum);
           
           System.out.print("Please enter another integer (negative to quit): ");
           x = scan.nextInt();
       }
       
       System.out.println("Have a nice day!");
   }
}
