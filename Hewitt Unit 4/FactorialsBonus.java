
/**
 * Factorials but the multiplication statement is also produced.
 *
 * @author Gavin Hewitt
 * @version 11/20/2020
 */

import java.util.*;

public class FactorialsBonus
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       int sum = 1;
       
       System.out.print("Please enter an integer: ");
       int ans = scan.nextInt();
       String mult = "";
       
       for(int i = 0; i < ans; i++)
       {
           sum *= (ans - i);
           mult += (ans - i) + "*";
       }
       mult = mult.substring(0, mult.length() - 1);
       System.out.println("The factorial for " + ans + " is " + mult + " = " + sum + ".");
   }
}
