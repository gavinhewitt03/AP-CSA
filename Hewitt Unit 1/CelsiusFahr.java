

/**
 * This program will convert a temperature from Celsius to Fahrenheit.
 *
 * @author Gavin Hewitt
 * @version 9/24/2020
 */
import java.util.*;
public class CelsiusFahr
{
  public static void main(String[] args)
  {
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Please enter a temperature in Celsius: ");
     
     double degCels = scan.nextDouble();
     double degFahr = (degCels * 9) / 5 + 32;
     double rounded_degFahr = (int)(degFahr * 1000 + 0.5);
     rounded_degFahr = rounded_degFahr / 1000;
     
     System.out.println(degCels + " degrees Celsius is equivalent to " + rounded_degFahr + " degrees Fahrenheit.");
  }
}
