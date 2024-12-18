
/**
 * This class reads an included min and max inputed by the user for a range of random integers and prints them to the console.
 *
 * @author Gavin Hewitt
 * @version 10/20/2020
 */

import java.util.*;

public class RandomIntegers
{
  public static void main(String[] args)
  {
      //declares Scanner object
      Scanner scan = new Scanner(System.in);
      
      //prompts user to enter first parameter and declares and initializes variable p1 with value entered
      System.out.print("Enter the minimum random integer: ");
      int p1 = scan.nextInt();
      
      //prompts user to enter second parameter and declares and initializes variable p2 with value entered
      System.out.print("Enter the maximum random integer: ");
      int p2 = scan.nextInt();
      
      //declares 3 variables r1, r2, and r3 and assigns them a random value between p1 and p2
      int r1 = (int)(Math.random() * ((p2 - p1) + 1)) + p1;
      int r2 = (int)(Math.random() * ((p2 - p1) + 1)) + p1;
      int r3 = (int)(Math.random() * ((p2 - p1) + 1)) + p1;
      
      //prints r1, r2, and r3 to the console
      System.out.println("Here are three random integers between " + p1 + " and " + p2 + " (inclusive): " + r1 + " " + r2 + " " + r3);
  }
}
