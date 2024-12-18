
/**
 * This program reads a String and prints it one character per line.
 *
 * @author Gavin Hewitt
 * @version 11/18/2020
 */

import java.util.*;

public class Characters
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter a phrase: ");
      String ans = scan.nextLine();
      
      for(int i = 0; i <= ans.length() - 1; i++)
      {
          System.out.println(ans.substring(i, i + 1));
      }
   }
}
