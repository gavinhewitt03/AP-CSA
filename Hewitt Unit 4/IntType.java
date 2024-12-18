
/**
 * This program uses a loop to determine and print the number of even and odd digits in an integer value inputted by the user.
 *
 * @author Gavin Hewitt
 * @version 11/12/2020
 */

import java.util.*;

public class IntType
{
  public static void main(String[] args)
  {
       Scanner scan = new Scanner(System.in);
       System.out.print("Please enter an integer: ");
       int num = scan.nextInt();
       int evenInt = 0, oddInt = 0;
       
       while(num > 0)
       {
           if((num % 2) == 0)
           {
               evenInt++;
           } else
           {
               oddInt++;
           }
           num /= 10;
       }
       System.out.println("The number of even integers in " + num + " is " + evenInt + " integers and " + oddInt + " odd integers.");
  }
}
