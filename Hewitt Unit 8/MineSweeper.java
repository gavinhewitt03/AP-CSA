
/**
 * This class adds all the values in the row and column given.
 *
 * @author Gavin Hewitt
 * @version 03/07/2021
 */
public class MineSweeper
{
    public static int sum(int[][] a, int r, int c)
    {
        int sum = 0;
        
        for(int i = r - 1; i < r + 2; i++)
        {
            if(i != a.length && i < a.length)
            {
                   for(int j = c - 1; j < c + 2; j++)
                   {
                       if(j < 0)
                       {
                           j++;
                        }
                       if(i < 0)
                       {
                           i++;
                       }
                       if(j < a[i].length)
                       {   
                           sum += a[i][j];
                       }
                    } 
            }
        }
        
        return sum;
    }
}
