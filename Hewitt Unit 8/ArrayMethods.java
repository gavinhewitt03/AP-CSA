
/**
 * This class is a static class that carries out specific methods on 2D int arrays.
 *
 * @author Gavin Hewitt
 * @version 03/02/2021
 */
public class ArrayMethods
{
    public static void fillRandomly(int[][] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = (int)(Math.random() * 50 + 1);
            }
        }
    }
    
    public static void print(int[][] a)
    {
        for(int[] x : a)
        {
            for(int y : x)
            {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
    
    public static void fillExactly(int[][] a, int x)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = x;
            }
        }
    }
    
    public static int minColumn(int[][] a, int c)
    {
        if(c >= a[0].length || c <= 0)
        {
            System.out.println("Nonexistent Column");
            return -999;
        } 
        
        int min = a[0][c];
        for(int i = 1; i < a.length; i++)
        {
            if(a[i][c] < min)
            {
                min = a[i][c];
            }
        }
        
        return min;
    }
    
    public static int elementCount(int[][] a, int x)
    {
        int count = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(a[i][j] == x)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static double average(int[][] a)
    {
        int sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                sum += a[i][j];
            }
        }
        
        double avg = (double) sum / (a.length * a[0].length);
        
        return avg;
    }
    
    public static int cornerSum(int[][] a)
    {
       int cornerSum = 0;
       cornerSum += a[0][a[0].length - 1];
       cornerSum += a[0][0];
       cornerSum += a[a.length - 1][0];
       cornerSum += a[a.length - 1][a[a.length - 1].length - 1];
       
       return cornerSum;
    }
    
    public static boolean isSquare(int[][] a)
    {
        if(a.length == a[0].length)
        {
            for(int i = 1; i < a.length; i++)
            {
                if(a[i].length != a[0].length)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static int funnySum(int[][] a)
    {
        int min = a[0][0], minRow = 0, minCol = 0, sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(a[i][j] < min)
                {
                    min = a[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i][minCol];
        }
        
        for(int j = 0; j < a[minRow].length; j++)
        {
            sum += a[minRow][j];
        }
        
        sum -= a[minRow][minCol];
        return sum;
    }
    
    public static int[] minimum(int[][] a)
    {
        int min = a[0][0];
        int minRow = 0;
        int minCol = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(a[i][j] < min)
                {
                   min = a[i][j];
                   minRow = i;
                   minCol = j;
                }
            }
        }
        
        int[] b = {min, minRow, minCol};
        return b;
    }
}
