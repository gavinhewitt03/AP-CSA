public class MineSweeperDriver
{
    public static void main(String[] args)
    {
        int[][] nums = new int[5][5];
        
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[row].length; col++){
                nums[row][col] = (row + 1)*(col + 1);
            }
        }
        
        for(int[] arr : nums){
            for(int curr : arr)
                System.out.print(curr + "\t");
            System.out.println();
        }
        System.out.println();
        System.out.println(MineSweeper.sum(nums, 0, 0));
        System.out.println(MineSweeper.sum(nums, 1, 1));
        System.out.println(MineSweeper.sum(nums, 4, 4));
    }
}
