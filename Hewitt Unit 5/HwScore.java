
/**
 * This class creates HwScore objects and their prespective methods to calculate grades.
 *
 * @author Gavin Hewitt
 * @version 01/09/2021
 */
public class HwScore
{
    private static final double A = 0.9, B = 0.8, C = 0.7, D = 0.6;
    private static double totalEarnedPoints, totalPossiblePoints;
    private double earnedPoints, possiblePoints;
    
    public HwScore(double e, double p)
    {
        earnedPoints = e;
        possiblePoints = p;
        totalEarnedPoints += e;
        totalPossiblePoints += p;
    }
    
    public void printGrade()
    {
        double g = earnedPoints / possiblePoints;
        if(g >= A)
            System.out.println("On this homework, you earned " + earnedPoints + " points out of " + possiblePoints + " possible points: A");
        else if(g >= B)
            System.out.println("On this homework, you earned " + earnedPoints + " points out of " + possiblePoints + " possible points: B");
        else if(g >= C)
            System.out.println("On this homework, you earned " + earnedPoints + " points out of " + possiblePoints + " possible points: C");
        else if(g >= D)
            System.out.println("On this homework, you earned " + earnedPoints + " points out of " + possiblePoints + " possible points: D");
        else
            System.out.println("On this homework, you earned " + earnedPoints + " points out of " + possiblePoints + " possible points: F");
    }
    
    public static void printOverallGrade()
    {
        double g = totalEarnedPoints / totalPossiblePoints;
        if(g >= A)
            System.out.println("You earned " + totalEarnedPoints + " points out of " + totalPossiblePoints + " possible points: A");
        else if(g >= B)
            System.out.println("You earned " + totalEarnedPoints + " points out of " + totalPossiblePoints + " possible points: B");
        else if(g >= C)
            System.out.println("You earned " + totalEarnedPoints + " points out of " + totalPossiblePoints + " possible points: C");
        else if(g >= D)
            System.out.println("You earned " + totalEarnedPoints + " points out of " + totalPossiblePoints + " possible points: D");
        else
            System.out.println("You earned " + totalEarnedPoints + " points out of " + totalPossiblePoints + " possible points: F"); 
    }
}
