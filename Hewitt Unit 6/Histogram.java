
/**
 * This class creates a histogram using values from 0-100 and astericks.
 *
 * @author Gavin Hewitt
 * @version 02/01/21
 */

import java.util.*;
public class Histogram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter numbers in the range from 1-100 (inclusive). \nEnter a value outside the range to quit. ");
        double x = scan.nextDouble();
        
        String[] histo = {"", "", "", "", "", "", "", "", "", ""};
        
        while(x >= 1 && x <= 100)
        {
            if(x >= 1 && x <= 10)
            {
                histo[0] += "*";
            } else if(x >= 11 && x <= 20)
            {
                histo[1] += "*";
            } else if(x >= 21 && x <= 30)
            {
                histo[2] += "*";
            } else if(x >= 31 && x <= 40)
            {
                histo[3] += "*";
            } else if(x >= 41 && x <= 50)
            {
                histo[4] += "*";
            } else if(x >= 51 && x <= 60)
            {
                histo[5] += "*";
            } else if(x >= 61 && x <= 70)
            {
                histo[6] += "*";
            } else if(x >= 71 && x <= 80)
            {
                histo[7] += "*";
            } else if(x >= 81 && x <= 90)
            {
                histo[8] += "*";
            } else if(x >= 91 && x <= 100)
            {
                histo[9] += "*";
            }
            x = scan.nextDouble();
        }
        
        System.out.println("|1- 10\t|" + histo[0]);
        System.out.println("|11- 20\t|" + histo[1]);
        System.out.println("|21- 30\t|" + histo[2]);
        System.out.println("|31- 40\t|" + histo[3]);
        System.out.println("|41- 50\t|" + histo[4]);
        System.out.println("|51- 60\t|" + histo[5]);
        System.out.println("|61- 70\t|" + histo[6]);
        System.out.println("|71- 80\t|" + histo[7]);
        System.out.println("|81- 90\t|" + histo[8]);
        System.out.println("|91- 100|" + histo[9]);
        
    }
}
