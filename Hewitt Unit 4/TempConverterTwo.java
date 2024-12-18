
/**
 * This program will convert from Fahrenheit to Celsius.
 *
 * @author Gavin Hewitt
 * @version 11/16/2020
 */

import java.util.*;

public class TempConverterTwo
{
   public static void main(String[] args)
   {
     Scanner scan = new Scanner(System.in);
      
     System.out.print("Please enter a temperature in Fahrenheit: " );
     double degFahr = scan.nextDouble();
     
     double degCels = (((degFahr - 32) * 5) / 9); 
     
     double rounded_degCels = 0;
     
     if(degCels > 0)
     {
         rounded_degCels = (int)(degCels * 1000 + 0.5);
         rounded_degCels /= 1000;
     } else if(degCels < 0)
     {
         rounded_degCels = (int)(degCels * 1000 - 0.5);
         rounded_degCels /= 1000;
     } 
     
     System.out.println(degFahr + " degrees equals " + rounded_degCels + " degrees Celsius.");
   }
}
