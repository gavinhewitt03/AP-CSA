
/**
 * This code will convert an input from the user in Fahrenheit to Celsius.
 *
 * @author Gavin Hewitt
 * @version 9/23/2020
 */
import java.util.*;
public class FahrCelsius
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  
    
    System.out.print("Please enter a temperature in Fahrenheit:" );
    double degFahr = scan.nextDouble();
    
    double degCels = (((degFahr - 32) * 5) / 9);
    
    double rounded_degCels = (int)(degCels * 1000 + 0.5);
    
    rounded_degCels = rounded_degCels / 1000;
    
    System.out.println(degFahr + " degrees Fahrenheit is equivalent to " + rounded_degCels + " degrees Celsius.");
  }
}
