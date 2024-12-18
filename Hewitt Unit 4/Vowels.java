
/**
 * This program reads a String and reads the number of vowels in it.
 *
 * @author Gavin Hewitt
 * @version 11/19/2020
 */

import java.util.*;

public class Vowels
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Please enter a word or phrase: ");
       String ans = scan.nextLine();
       ans.toLowerCase();
       
       int count = 0;
       
       for(int i = ans.length(); i >= 1; i--)
       {
          if(ans.substring(i-1,i).equals("a")||ans.substring(i-1,i).equals("e")||ans.substring(i-1,i).equals("i")||ans.substring(i-1,i).equals("o"))
          {
              count++;
          } else if(ans.substring(i-1,i).equals("u")||ans.substring(i-1,i).equals("y"))
          {
              count++;
          }
       }
       
       System.out.println("There is/are " + count + " vowel(s) in \"" + ans + "\".");
   }
}
