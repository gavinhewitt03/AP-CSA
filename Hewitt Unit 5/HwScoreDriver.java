
/**
 * This class is a driver class for the HwScore class.
 *
 * @author Gavin Hewitt
 * @version 01/09/2021
 */
public class HwScoreDriver
{
    public static void main(String[] args)
    {
        HwScore hw1 = new HwScore(26.5, 30.0);
        HwScore hw2 = new HwScore(29, 27.5);
        HwScore hw3 = new HwScore(0, 20);
        HwScore hw4 = new HwScore(16, 20);
        
        hw1.printGrade();
        hw2.printGrade();
        hw3.printGrade();
        HwScore.printOverallGrade();
    }
}
