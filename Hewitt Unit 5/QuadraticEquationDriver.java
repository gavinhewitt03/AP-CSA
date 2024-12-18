
/**
 * This class is a driver class for the QuadraticEquation class.
 *
 * @author Gavin Hewitt
 * @version 01/07/2021
 */
public class QuadraticEquationDriver
{
    public static void main(String[] args)
    {
        //equation one
        QuadraticEquation one = new QuadraticEquation(5, 4, 2);
        
        System.out.println("a = " + one.getA());
        System.out.println("b = " + one.getB());
        System.out.println("c = " + one.getC());
        if(one.getDiscriminant() < 0)
            System.out.println("There are no real roots.");
        else if(one.getDiscriminant() == 0)
            System.out.println("One Root: " + one.getRoot1());
        else
            System.out.println("Roots: " + one.getRoot1() + " and " + one.getRoot2());
        System.out.println();
        
        //equation two
        QuadraticEquation two = new QuadraticEquation(1, -10, 25);
        
        System.out.println("a = " + two.getA());
        System.out.println("b = " + two.getB());
        System.out.println("c = " + two.getC());
        if(two.getDiscriminant() < 0)
            System.out.println("There are no real roots.");
        else if(two.getDiscriminant() == 0)
            System.out.println("One Root: " + two.getRoot1());
        else
            System.out.println("Roots: " + two.getRoot1() + " and " + two.getRoot2());
        System.out.println();
        
        //equation three
        QuadraticEquation three = new QuadraticEquation(1, 5, -2);
        
        System.out.println("a = " + three.getA());
        System.out.println("b = " + three.getB());
        System.out.println("c = " + three.getC());
        if(three.getDiscriminant() < 0)
            System.out.println("There are no real roots.");
        else if(three.getDiscriminant() == 0)
            System.out.println("One Root: " + three.getRoot1());
        else
            System.out.println("Roots: " + three.getRoot1() + " and " + three.getRoot2());
        System.out.println();
    }
}
