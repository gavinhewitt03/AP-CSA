
/**
 * Static class containing array methods.
 *
 * @author Gavin Hewitt
 * @version 01/25/2021
 */
public class ArrayMethods
{
    public static int minimum(int[] a)
    {
        int minValue = a[0];
        
        for(int i = 0; i < a.length; i++)
        {
            int val = a[i];
            
            if(val < minValue)
            {
                minValue = val;
            }
        }
        
        return minValue;
    }
    
    public static int maximum(int[] a)
    {
        int maxValue = a[0];
        
        for(int i = 0; i < a.length; i++)
        {
            int val = a[i];
            
            if(val > maxValue)
            {
                maxValue = val;
            }
        }
        
        return maxValue;
    }
    
    public static int sum(int[] a)
    {
        int sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        
        return sum;
    }
    
    public static double average(int[] a)
    {
        int sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        
        double average = (int)((double) sum / a.length * 100 + 0.5);
        average /= 100;
        
        return average;
    }
    
    public static boolean large(int[] a, int x)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > x)
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean allLarger(int[] a, int x)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < x)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean repeats(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            int count = 0;
            
            for(int j = i; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void positive(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = Math.abs(a[i]);
        }
    }
    
    public static void flip(int[] a)
    {
        int[] b = new int[a.length];
        int count = a.length - 1;
        
        for(int i = 0; i < a.length; i++)
        {
            b[i] = a[count];
            count--;
        }
        
        for(int i =0; i < b.length; i++)
        {
            a[i] = b[i];
        }
    }
    
    public static void right(int[] a)
    {
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++)
        {
            if(i < a.length - 1)
            {
                b[i + 1] = a[i];
            } else if(i == a.length - 1)
            {
                b[0] = a[i];
            }
        }
        
        for(int i = 0; i < b.length; i++)
        {
            a[i] = b[i];
        }
    }
}
