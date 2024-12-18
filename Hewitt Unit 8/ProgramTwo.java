
/**
 * Creates a 2D array and fills it with values.
 *
 * @author Gavin Hewitt
 * @version 03/08/21
 */
public class ProgramTwo
{
    public static void main(String[] args)
    {
        int[][] a = new int[6][6];
        int k = 1;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = k + j;
            }
            k += 2;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
