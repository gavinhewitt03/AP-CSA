
/**
 * This class will read the subtotal of a bill and give the tip amount based on a gratuity rate provided.
 *
 * @author Gavin Hewitt 
 * @version 9/29/2020
 */
import java.util.*;
public class Tips
{
  public static void main(String[] args)
  {
     Scanner scan = new Scanner(System.in);
     
     System.out.print("Enter the bill subtotal: ");
     double subtotal = scan.nextDouble();
     
     System.out.print("Enter the gratuity rate: ");
     double gratuityRate = scan.nextDouble();
     
     gratuityRate /= 100;
     
     double tip = subtotal * gratuityRate;
     
     double total = subtotal + tip;
     
     gratuityRate *= 100;
     
     System.out.println("For a bill with a subtotal of $" + subtotal + " and a tip rate of " + gratuityRate + "%,");
     System.out.println("the tip would be $" + tip + " and the total would be $" + total + ".");
     
  }
}
