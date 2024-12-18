
/**
 * This class will read ten digits as a String and output them as a phone numbber
 *
 * @author Gavin Hewitt
 * @version 10/21/2020
 */

import java.util.*;

public class PhoneNumber
{
   public static void main(String[] args)
   {
       //creates scanner object
       Scanner scan = new Scanner(System.in);
       
       //prompts user to input 10 digits and assigns it to a String object
       System.out.print("Please enter ten digits to be formatted: ");
       String number = new String(scan.nextLine());
       
       //splits string into different subsections to format as number
       System.out.println("(" + number.substring(0,3) + ") " + number.substring(3,6) + "-" + number.substring(6, 10));
   }
}
