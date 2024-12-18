
/**
 * This program will produce a multiplication table for the integers 1 through 10 by themselves.
 *
 * @author Gavin Hewitt
 * @version 11/17/2020
 */
public class MultTable
{
   public static void main(String[] args)
   {
       for(int i = 1; i <= 10; i++)
       {
           for(int j = 1; j <= 10; j++)
           {
               System.out.print(i * j + "\t");
           }
           System.out.println();
       }
   }
}
