
/**
 * Write a description of class ArrayMethodsRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMethodsClient
{
    public static void main(String[] args)
    {
        int[] nums = {3,-22,3,-1,19,3,3,-5};
        
        for(int x : nums)
            System.out.print(x + "   ");
            
        System.out.println("\nThe minimum of the array is " + ArrayMethods.minimum(nums));
        System.out.println("The maximum of the array is " + ArrayMethods.maximum(nums));
        System.out.println("The sum of the array is " + ArrayMethods.sum(nums));
        System.out.println("The average of the array is " + ArrayMethods.average(nums));
        System.out.println("It is " + ArrayMethods.large(nums, 2) +
                            " that the array has an element greater than 2");
        
        System.out.println("It is "+ ArrayMethods.allLarger(nums, 0) + " that all integers"+
                            " in the array are larger than  0.");
        System.out.println("It is " + ArrayMethods.repeats(nums) + " that there are duplicate elements.");
        
        System.out.println("If all the values were positive, the array would look like this: ");
        //public static void positive(int[] arrs) in ArrayMethods class
        ArrayMethods.positive(nums);
        for(int x: nums)
            System.out.print(x + "   ");
                            
        System.out.println("\nIf the previous array were flipped it would look like this:");
        ArrayMethods.flip(nums);
        for(int y: nums)
            System.out.print(y +"   ");
            
        System.out.println("\nIf every element in the preceding array were shifted right, it would look like this:  ");
        ArrayMethods.right(nums);
        for(int x: nums)
            System.out.print(x + "   ");
        
        
        
    }
}

