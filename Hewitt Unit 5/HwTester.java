public class HwTester
{
    public static void main(String[]args)
    {
        HwScore hw1 = new HwScore(28.5, 30);
        HwScore hw2 = new HwScore(25, 30.5);
        HwScore hw3 = new HwScore(10, 15);
        HwScore hw4 = new HwScore (17.5,20);
        
        hw1.printGrade();
        hw2.printGrade();
        hw3.printGrade();
        hw4.printGrade();
        HwScore.printOverallGrade();
    }
}