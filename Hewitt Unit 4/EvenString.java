
/**
 * This program reads a line of input as a sring and prints every second letter of the string beginning with the second letter.
 *
 * @author Gavin Hewitt
 * @version 11/18/2020
 */

import java.util.*;

public class EvenString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a phrase: ");
        String ans = scan.nextLine();
        
        for(int i = 1; i <= ans.length() - 1; i += 2)
        {
            System.out.print(ans.substring(i, i + 1));
        }
    }
}
