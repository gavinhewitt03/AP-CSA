
/**
 * This program will find the distance between two points entered by the user.
 *
 * @author Gavin Hewitt
 * @version 10/15/2020
 */

import java.util.*;

public class Distance
{
   public static void main(String[] args)
   {
       //declares Scanner object
       Scanner scan = new Scanner(System.in);
       
       //declares variables for the coordinates of both points and the distance between them
       double x1, y1, x2, y2, d;
       
       //prompts user to input x-value and intializes x1 as value of user input
       System.out.print("Please enter the x-value for the first point: ");
       x1 = scan.nextDouble();
       
       //prompts user to input y-value and initializes y1 as value of user input
       System.out.print("Please enter the y-value for the first point: ");
       y1 = scan.nextDouble();
       
       //prompts user to input another x-value and intializes x2 as value of user input
       System.out.print("Please enter the x-value for the second point: ");
       x2 = scan.nextDouble();
       
       //prompts user to input another y-value and initializes y2 as value of user input
       System.out.print("Please enter the y-value for the second point: ");
       y2 = scan.nextDouble();
       
       //initializes the distance variable d and calculates the distance between the two points rounded to the nearest thousandth
       d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
       d = ((int)(d * 1000) + 0.5) / 1000;
       
       //displays the distance between the two points
       System.out.print("The distance between point (" + x1 + ", " + y1 + ") and point (" + x2 + ", " + y2 + ") is, " + d + ".");
   }
}
