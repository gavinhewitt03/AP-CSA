
/**
 * This class reads the names of three political candidates and the number of votes they each received in the last election and returns the percentage of vote they received.
 *
 * @author Gavin Hewitt
 * @version 10/20/2020
 */

import java.util.*;

public class ElectionStats
{
   public static void main(String[] args)
   {
       //declares Scanner object
       Scanner scan = new Scanner(System.in);
       
       //prompts user to enter the name of all three candidates and assigns each candiadate to a String variable
       System.out.print("Please enter the name of the first candidate: ");
       String can1 = scan.nextLine();
       
       System.out.print("Please enter the name of the second candidate: ");
       String can2 = scan.nextLine();
       
       System.out.print("Please enter the name of the third candidate: ");
       String can3 = scan.nextLine();
       
       System.out.println(" ");
       //prompts user to enter the number of votes each candidate received assigns value to a variable
       System.out.print("How many votes did " + can1 + " receieve? ");
       int vote1 = scan.nextInt();
       
       System.out.print("How many votes did " + can2 + " receieve? ");
       int vote2 = scan.nextInt();
       
       System.out.print("How many votes did " + can3 + " receieve? ");
       int vote3 = scan.nextInt();
       
       System.out.println(" ");
       //prints key for value printed
       System.out.println("Candidate Name / % Vote");
       
       System.out.println(" ");
       //calculates % vote for each candidate and rounds to three decimal places
       int voteTotal = vote1 + vote2 + vote3;
       
       double can1Vote = ((double)vote1 / voteTotal) * 100;
       can1Vote = (int)(can1Vote * 1000);
       can1Vote /= 1000;
       
       double can2Vote = ((double)vote2 / voteTotal) * 100;
       can2Vote = (int)(can2Vote * 1000);
       can2Vote /= 1000;
       
       double can3Vote = ((double)vote3 / voteTotal) * 100;
       can3Vote = (int)(can3Vote * 1000);
       can3Vote /= 1000;
       
       //prints each candidate's election stats
       System.out.println(can1 + " / " + can1Vote);
       
       System.out.println(can2 + " / " + can2Vote);
       
       System.out.println(can3 + " / " + can3Vote);
   }
}
