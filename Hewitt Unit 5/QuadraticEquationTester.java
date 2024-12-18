//Run this class to test the appropriate methods in the 
//QuadraticEquation class

public class QuadraticEquationTester
{
    public static void main(String[]args)
    {
        QuadraticEquation bob = new QuadraticEquation(3,1,5);
        QuadraticEquation sam = new QuadraticEquation(1,12,36);
        
        System.out.println("a = " + bob.getA());
        System.out.println("b = " + bob.getB());
        System.out.println("c = " + bob.getC());
       
        if(bob.getDiscriminant() == 0)
            System.out.println("One root: " + bob.getRoot1());
        else if(bob.getDiscriminant() < 0)
            System.out.println("There are no real roots.");
        else    
            System.out.println("Roots: " + bob.getRoot1() + " " + bob.getRoot2());
        
        System.out.println("\na = " + sam.getA());
        System.out.println("b = " + sam.getB());
        System.out.println("c = " + sam.getC());
       
        if(sam.getDiscriminant() == 0)
            System.out.println("One root: " + sam.getRoot1());
        else if(sam.getDiscriminant() < 0)
            System.out.println("There are no real roots.");
        else    
            System.out.println("Roots: " + sam.getRoot1() + " " + sam.getRoot2());    
            
        sam.setA(1);
        sam.setB(-7);
        sam.setC(12);
         
        System.out.println("\na = " + sam.getA());
        System.out.println("b = " + sam.getB());
        System.out.println("c = " + sam.getC());
       
        if(sam.getDiscriminant() == 0)
            System.out.println("One root: " + sam.getRoot1());
        else if(sam.getDiscriminant() < 0)
            System.out.println("There are no real roots.");
        else    
            System.out.println("Roots: " + sam.getRoot1() + " and " + sam.getRoot2());        
    }
}