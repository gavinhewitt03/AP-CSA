
/**
 * This class will convert seconds to hours, minutes, and seconds.
 *
 * @author Gavin Hewitt
 * @version 9/28/2020
 */

import java.util.*;
public class Hours
{
  public static void main(String[] agrs)
  {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter an number of seconds: ");
      int inp = scan.nextInt();
      
      int hours = inp / 3600;
      int minutes = (inp % 3600) / 60;
      int seconds = (inp % 3600) % 60;
      
      System.out.println(inp + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
      
  }
}
