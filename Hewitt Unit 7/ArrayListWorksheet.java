
/**
 * Checks the array list worksheet.
 *
 * @author Gavin Hewitt
 * @version 02/22/21
 */
import java.util.*;
public class ArrayListWorksheet
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        nums.add(5);
        nums.add(6);
        nums.add(6);
        nums.add(6);
        nums.add(7);
        nums.add(7);
        nums.add(8);
        nums.add(8);
        nums.add(8);
        
        for(Integer x : nums)
        {
            System.out.print(x + ", ");
        }
        System.out.println();
        
        int sum = 0;
        for(Integer x : nums)
        {
            sum += x;
        }
        System.out.println(sum);
        
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) % 2 == 1)
                nums.set(i, nums.get(i) * 2);
        }
        
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) == 2 || nums.get(i) == 6)
            {
                nums.remove(i);
                i--;
            }
        }
        
        for(Integer x : nums)
        {
            System.out.print(x + ", ");
        }
        System.out.println();
    }
}
