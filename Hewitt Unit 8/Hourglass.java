
/**
 * This class reads a designated number of Strings and displays them in the form of an hourglass.
 *
 * @author Gavin Hewitt
 * @version 03/09/2021
 */
import java.util.*;
public class Hourglass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        String junk = scan.nextLine();
        String[] inputs = new String[num];
        int i = 0;
        
        while(i < num)
        {
            inputs[i] = scan.nextLine();
            String[][] hourglass = new String[inputs[i].length()][inputs[i].length()];
            for(int j = 0; j < hourglass.length; j++)
            {
                for(int r = 0; r < hourglass[j].length; r++)
                {
                    hourglass[j][r] = " ";
                }
            }
            
            for(int j = 0; j < hourglass[0].length; j++)
            {
                hourglass[0][j] = inputs[i].substring(j, j + 1);
            }
            
            for(int j = 0; j < hourglass[0].length; j++)
            {
                hourglass[hourglass.length - 1][j] = inputs[i].substring(j , j + 1);
            }
            
            for(int j = 1; j < hourglass.length; j++)
            {
                hourglass[j][j] = inputs[i].substring(j, j + 1);
            }
            
            for(int j = hourglass.length - 1; j > 0; j--)
            {
                hourglass[hourglass.length - 1 - j][j] = inputs[i].substring(j, j + 1);
            }
            
            for(int j = 0; j < hourglass.length; j++)
            {
                for(int r = 0; r < hourglass[j].length; r++)
                {
                    System.out.print(hourglass[j][r]);
                }
                System.out.println();
            }
            
            System.out.println();
            i++;
        }
        
        
    }
}
