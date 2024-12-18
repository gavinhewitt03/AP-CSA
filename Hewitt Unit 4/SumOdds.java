
/**
 * This program finds the sum of all odd digits in an input.
 *
 * @author Gavin Hewitt
 * @version 11/12/2020
 */

import java.util.*;

public class SumOdds
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter an integer: ");
      int num = scan.nextInt(), oddSum = 0;
      
      while(num > 0)
      {
          if((num % 2) != 0)
          {
              oddSum += (num % 10);
          }
          num /= 10;
      }   
      System.out.println("The sum of all odd integers is " + oddSum + ".");
   }
}
