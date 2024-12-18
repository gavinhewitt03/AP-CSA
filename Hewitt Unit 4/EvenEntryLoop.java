
/**
 * This program prompts the user to enter an even value and uses a sentinel value to stop the loop.
 *
 * @author Gavin Hewitt
 * @version 11/20/2020
 */

import java.util.*;

public class EvenEntryLoop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an even integer (999 to quit): ");
        int ans = scan.nextInt();
        
        while(ans != 999)
        {
            if(ans % 2 == 0)
            {
                System.out.println("Good job!");
            } else
            {
                System.out.println("Error. Number not even.");
            }
            
            System.out.print("Please enter another number (999 to quit): ");
            ans = scan.nextInt();
        }
        
        System.out.println("Have a nice day!");
    }
}
