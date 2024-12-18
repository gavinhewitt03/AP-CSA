
/**
 * This class will determine and display the number of odd and even integers for an unknown number of integers input by the user.
 *
 * @author Gavin Hewitt
 * @version 11/17/2020
 */

import java.util.*;

public class IntTypeTwo
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Please enter an integer: (-999) to quit) ");
       int input = scan.nextInt();
       int sumEven = 0, sumOdd = 0;
       
       while(input != -999)
       {
           if(input % 2 == 0)
           {
               sumEven++;
           } else
           {
               sumOdd++;
           }
           
           System.out.print("Please enter another integer: (-999 to quit) ");
           input = scan.nextInt();
       }
       
       System.out.println(sumOdd + " odd integers and " + sumEven + " even intergers were entered.");
       System.out.println("Have a great day!");
   }
}
