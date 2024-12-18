
/**
 * This class counts the number of times an integer between -25 and 25 (inclusive) was entered.
 *
 * @author Gavin Hewitt
 * @version 02/02/21
 */

import java.util.*;

public class LowCount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[51];
        System.out.print("Enter integers in the range of 0-50 (inclusive). \nSignal end of list with a number outside of the range.\n");
        int x = scan.nextInt();
        
        while(x >= -25 && x <= 25)
        {
            for(int i = -25; i < arr.length; i++)
            {
                if(i == x)
                {
                    arr[i + 25] = arr[i + 25] + 1;
                }
            }
            x = scan.nextInt();
        }
        
        System.out.println("Number\tTimes");
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                System.out.println((i - 25) + "\t" + arr[i]);
            }
        }
    }
}
