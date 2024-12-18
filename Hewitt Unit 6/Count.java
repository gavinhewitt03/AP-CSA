
/**
 * This class counts the number of times an integer between 0 and 50 (inclusive) was entered.
 *
 * @author Gavin Hewitt
 * @version 02/01/21
 */

import java.util.*;

public class Count
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[51];
        System.out.print("Enter integers in the range of 0-50 (inclusive). \nSignal end of list with a number outside of the range.\n");
        int x = scan.nextInt();
        
        while(x >= 0 && x <= 50)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(i == x)
                {
                    arr[i] = arr[i] + 1;
                }
            }
            x = scan.nextInt();
        }
        
        System.out.println("Number\tTimes");
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                System.out.println(i + "\t" + arr[i]);
            }
        }
    }
}
