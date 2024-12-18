
/**
 * This class creates Rectangle objects using perspective methods.
 *
 * @author Gavin Hewitt
 * @version 03/26/2021
 */
public class Rectangle
{
    private double length, width;
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setLength(double l)
    {
        length = l;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getDiagonal()
    {
        return Round.round(Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2)));
    }
    
    public double getArea()
    {
        return Round.round(length * width);
    }
    
    public double getPerimeter()
    {
        return 2 * length + 2 * width;
    }
    
    public String toString()
    {
        return "The length is " + length + " and the width is " + width;
    }
}
