
/**
 * This class reads the users first, middle, and last names and returns their initials.
 *
 * @author Gavin Hewitt
 * @version 10/22/2020
 */

import java.util.*;

public class Initials
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       //prompts the user to enter their first, middle, and last names and assigns them to individual String objects
       System.out.print("Please enter your first name: ");
       String first = new String(scan.nextLine());
       
       System.out.print("Please enter your middle name: ");
       String middle = new String(scan.nextLine());
       
       System.out.print("Please enter your last name: ");
       String last = new String(scan.nextLine());
       
       //uses substring method to take the first letter of each name and capitalizes for initials
       String fInitial = new String(first.substring(0, 1));
       fInitial = fInitial.toUpperCase();
       
       String mInitial = new String(middle.substring(0, 1));
       mInitial = mInitial.toUpperCase();
       
       String lInitial = new String(last.substring(0,1));
       lInitial = lInitial.toUpperCase();
       
       //prints the user's initials
       System.out.println("Your initials are: " + fInitial + ". " + mInitial + ". " + lInitial + ".");
   }
}
