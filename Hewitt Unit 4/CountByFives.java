
/**
 * Creates a table that counts by fives.
 *
 * @author Gavin Hewitt
 * @version 11/19/2020
 */
public class CountByFives
{
   public static void main(String[] args)
   {
       for(int i = 5; i < 456; i += 50)
       {
           for(int j = 0; j < 46; j += 5)
           {
               System.out.print(i + j + "\t");
           }
           System.out.println();
       }
   }
}
