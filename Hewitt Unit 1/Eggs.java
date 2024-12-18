
/**
 * This class gives the amount owed for a number of eggs.
 *
 * @author Gavin Hewitt
 * @version 9/29/2020
 */
import java.util.*;
public class Eggs
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter the number of eggs you would like: ");
      int eggs = scan.nextInt();
      
      double dozen = 3.25;
      double single = 0.45;
      
      int numDozen = (eggs / 12);
      int numSingle = (eggs % 12);
      
      double priceDozen = numDozen * dozen;
      double priceSingle = numSingle * single;
      
      double totalPrice = priceDozen + priceSingle;
      
      System.out.println("You ordered " + eggs + " eggs.");
      System.out.print("That's " + numDozen + " dozen at $3.25 per dozen and " + numSingle + " loose eggs at " +
                        "$0.45 each for a total of $" + totalPrice + ".");
  }
}
