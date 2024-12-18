
/**
 * This class creates QuadraticEquation objects and its methods.
 *
 * @author Gavin Hewitt
 * @version 01/07/2021
 */
public class QuadraticEquation
{
    private double a, b, c;
    
    public QuadraticEquation(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
    
    public double getA()
    {
        return a;
    }
    
    public void setA(int x)
    {
        a = x;
    }
    
    public double getB()
    {
        return b;
    }
    
    public void setB(int y)
    {
        b = y;
    }
    
    public double getC()
    {
        return c;
    }
    
    public void setC(int z)
    {
        c = z;
    }
    
    public double getDiscriminant()
    {
        return Math.pow(b, 2) - (4 * a * c);
    }
    
     public double getRoot1()
    {
        double root = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        root = (int)(root * 100);
        root /= 100;
        return root;
    }
    
    public double getRoot2()
    {
        double root = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        root = (int)(root * 100);
        root /= 100;
        return root;
    }
}
