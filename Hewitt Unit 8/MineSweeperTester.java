
/**
 * Write a description of class MineSweeperTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MineSweeperTester
{
    public static void main(String[] args)
    {
        int[][] arr = { {88, 99, 100, 100},
                        {70, 85, 99, 91},
                        {85, 90, 23, 76} };
        
        System.out.println(MineSweeper.sum(arr, 1, 1));
        System.out.println(MineSweeper.sum(arr, 0, 0));
    }
}
