
/**
 * This program uses loops to find the sum of even all integers between 2 and 100. 
 *
 * @author Gavin Hewitt
 * @version 11/12/2020
 */
public class SumEven
{
   public static void main(String[] args)
   {
     int sum = 0;
     for (int num = 2; num <= 100; num += 2)
     {
         sum += num;
     }
     System.out.println("The sum of all even integers between 2 and 100 is " + sum + ".");
    }
}
