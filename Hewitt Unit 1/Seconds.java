
/**
 * This class will convert a time in hours, minutes, and seconds to only seconds.
 *
 * @author Gavin Hewitt
 * @version 9/24/2020
 */

import java.util.*;
public class Seconds
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Please enter a number of hours: ");
       double inpHrs = scan.nextDouble();
       
       System.out.print("Please enter a number of minutes: ");
       double inpMin = scan.nextDouble();
       
       System.out.print("Please enter a number of seconds: ");
       double inpSec = scan.nextDouble();
       
       double outHrs = inpHrs * 3600;
       double outMin = inpMin * 60;
       double outSec = inpSec;
       
       double totalSec = outHrs + outMin + outSec;
       
       System.out.println(inpHrs + " hours, " + inpMin + " minutes, and " + inpSec + " seconds is equal to " + totalSec + " seconds.");
   }
}
