
/**
 * This program uses loops to find the sum of all even integers between 2 and 100.
 *
 * @author Gavin Hewitt
 * @version 11/12/2020
 */
public class SumSquares
{
   public static void main(String[] args)
   {
       int sum = 0;
       int num = 1;
       while(Math.pow(num, 2) <= 100)
       {
           sum += Math.pow(num,2);
           num++;
       }
       System.out.println("The sum of all squares between 1 and 100 is " + sum + ".");
   }
}
