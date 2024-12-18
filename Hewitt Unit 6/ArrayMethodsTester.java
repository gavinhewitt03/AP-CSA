
/**
 * This class tests the ArrayMethods class methods.
 *
 * @author Gavin Hewitt
 * @version 01/29/2020
 */
public class ArrayMethodsTester
{
    public static void main(String[] args)
    {
        int[] x = {1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 7};
        
        System.out.println("Min: " + ArrayMethods.minimum(x));
        System.out.println("Max: " + ArrayMethods.maximum(x));;
        System.out.println("Sum: " + ArrayMethods.sum(x));
        System.out.println("Average : " + ArrayMethods.average(x));
        System.out.println("Any value greater than 2? " + ArrayMethods.large(x, 2));
        System.out.println("Are all values greater than 2? " + ArrayMethods.allLarger(x, 2));
        System.out.println("Are all values greater than -20? " + ArrayMethods.allLarger(x, -20));
        System.out.println("Repeats: " + ArrayMethods.repeats(x));
        ArrayMethods.positive(x);
        System.out.print("All values are positive now: ");
        for(int y : x)
        {
            System.out.print(y + "  ");
        }
        ArrayMethods.flip(x);
        System.out.print("\nAll values of previous array are flipped: ");
        for(int z : x)
        {
            System.out.print(z + "  ");
        }
        ArrayMethods.right(x);
        System.out.print("\nAll values of previous array are moved one to the right: ");
        for(int a : x)
        {
            System.out.print(a + "  ");
        }
    }
}
