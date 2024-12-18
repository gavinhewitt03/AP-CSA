
/**
 * This program reads a String and prints it in reverse.
 *
 * @author Gavin Hewitt
 * @version 11/19/2020
 */

import java.util.*;

public class Backwards
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.print("Please enter a word or phrase: ");
       String ans = scan.nextLine();
       
       for(int i = ans.length(); i >= 1; i--)
       {
           System.out.print(ans.substring(i - 1, i));
       }
   }
}
