
/**
 * Reads the length of the sides of a triangle from the user and calculates the area of the triange using Heron's formula.
 *
 * @author Gavin Hewitt
 * @version 10/19/2020
 */

import java.util.*;

public class Heron
{
  public static void main(String[] args)
  {
      //declares Scanner object
      Scanner scan = new Scanner(System.in);
      
      //prompts the user to enter the value of one side and declares and initializes variable s1 with the value entered
      System.out.print("Please enter the length of the first side: ");
      double s1 = scan.nextDouble();
      
      //prompts the user to enter the value of the second side and declares and initializes variable s2 with the value entered
      System.out.print("Please enter the length of the second side: ");
      double s2 = scan.nextDouble();
      
      //prompts the user to enter the value of the third side and declares and initializes variable s3 with the value entered
      System.out.print("Please enter the length of the third side: ");
      double s3 = scan.nextDouble();
      
      //declares and initializes the value of s
      double s = (s1 + s2 + s3) / 2;
      
      //declares, initializes, and rounds a variable for the area and uses Heron's formula to calculate it then prints value to console
      double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
      area = (int)(area * 1000);
      area /= 1000;
      
      System.out.println("The area of a triangle with sides " + s1 + " " + s2 + " " + s3 + " is " + area + " square units.");
  }
}
