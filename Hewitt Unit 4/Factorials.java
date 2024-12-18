
/**
 * This program finds the factorial for an integer
 *
 * @author Gavin Hewitt
 * @version 11/20/2020
 */

import java.util.*;

public class Factorials
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       int sum = 1;
       
       System.out.print("Please enter an integer: ");
       int ans = scan.nextInt();
       
       for(int i = 0; i < ans; i++)
       {
           sum *= (ans - i);
       }
       
       System.out.println("The factorial for " + ans + " is " + sum + ".");
   }
}
