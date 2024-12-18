
/**
 * This class will convert miles to kilometers.
 *
 * @author Gavin Hewitt
 * @version 9/24/2020
 */
import java.util.*;
public class MilesConvert
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter a distance in miles: ");
      
      double disMI = scan.nextDouble();
      final double MI_TO_KM = 1.60935;
      double disKM = disMI * MI_TO_KM;
      double rounded_disKM = (int)(disKM * 1000 + 0.5);
      rounded_disKM = rounded_disKM / 1000;
      
      System.out.println(disMI + " miles is equivalent to " + rounded_disKM + " kilometers.");
  }
}
