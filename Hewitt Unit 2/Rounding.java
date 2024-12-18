
/**
 * This class reads a decimal value and the desirec number of places the decimal is rounded to and outputs the decimal rounded to that place.
 *
 * @author Gavin Hewitt
 * @version 10/21/2020
 */

import java.util.*;

public class Rounding
{
   public static void main(String[] args)
   {
       //declares Scanner object
       Scanner scan = new Scanner(System.in);
       
       //prompts user to enter decimal place and stores value as a String object
       System.out.print("Please enter the number to round: ");
       String decimal = new String(scan.nextLine());
       
       //prompts the user to enter the point to round to and uses the substring method to round
       System.out.print("Please enter how many decimal places to round to: ");
       int place = scan.nextInt();
       String rounded = decimal.substring(0, (place + 1));
       
       //prints the decimal value rounded to desired place
       System.out.println(decimal + " rounded to the nearest " + place + " decimal(s) is " + rounded + ".");
   }
}
