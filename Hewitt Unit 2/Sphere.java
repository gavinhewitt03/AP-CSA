
/**
 * This class reads the radius of a sphere and returns the volume and surface area of the sphere rounded four decimal places.
 *
 * @author Gavin Hewitt
 * @version 10/19/2020
 */

import java.util.*;

public class Sphere
{
  public static void main(String[] args)
  {
      //declares Scanner object
      Scanner scan = new Scanner(System.in);
      
      //declares variable for units and prompts user to enter string value
      System.out.print("Please enter the units of measure: ");
      String units = scan.nextLine();
      
      //declares variable for radius and prompts user to enter value
      System.out.print("Please enter the radius of the sphere: ");
      double r = scan.nextDouble();
      
      //declares and initializes variable for the volume of the sphere and rounds to the fourth decimal place
      double volume = 1.333333333 * Math.PI * Math.pow(r, 3);
      volume = (int)(volume * 10000);
      volume /= 10000;
      
      //declares and initializes variable for the surface area of the sphere and rounds to the fourth decimal place
      double sa = 4 * Math.PI * Math.pow(r, 2);
      sa = (int)(sa * 10000);
      sa/= 10000;
      
      //prints the volume and surface area of the sphere with units 
      System.out.println("The volume of the sphere is " + volume + " cubic " + units + ".");
      System.out.println("The surface area of the sphere is " + sa + " square " + units + ".");
  }
}
