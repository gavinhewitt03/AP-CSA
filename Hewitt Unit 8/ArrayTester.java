
/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main(String[] args)
    {
       int[][] arr = new int[5][5]; 
       
       ArrayMethods.fillExactly(arr, 2);
       ArrayMethods.print(arr);
       
       ArrayMethods.fillRandomly(arr);
       ArrayMethods.print(arr);
       
       //System.out.println(ArrayMethods.minColumn(arr, 3));
       //System.out.println(ArrayMethods.elementCount(arr, 34));
       
       //System.out.println(ArrayMethods.average(arr));
       //System.out.println(ArrayMethods.cornerSum(arr));
       //System.out.println(ArrayMethods.isSquare(arr));
       //System.out.println(ArrayMethods.funnySum(arr));
       //System.out.println(ArrayMethods.minimum(arr));
    }
}
