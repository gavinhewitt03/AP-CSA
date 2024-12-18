
/**
 * This class will create Rectangle objects and their appropriate methods.
 *
 * @author Gavin Hewitt
 * @version 12/15/2020
 */
public class Rectangle
{
    // instance variables
    private double length, width;
    
    //static variables and static counter
    public static final int NUM_SIDES = 4, NUM_ANGLES = 90;
    private static int numRectangles = 0;
    
    /**
     * Default constructor.
     */
    public Rectangle()
    {
        length = 1;
        width = 1;
    }
    
    /**
     * Overloaded constructor.
     */
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    //getters and setters
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setLength(double l)
    {
        length = l;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getArea()
    {
        double area = length * width;
        area = (int)(area * 100);
        area /= 100;
        return area;
    }
    
    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }
    
    public String toString()
    {
        return "The current Rectangle's length is: " + length + " and its width is: " + width + ".";
    }
    
    public String isSquare()
    {
        if(length == width)
        {
            return "The Rectangle is a square.";
        } else
        {
            return "The Rectangle is not a square.";
        }
    }
    
    public boolean equals(Rectangle r)
    {
        return this.getLength() == r.getLength() && this.getWidth() == r.getWidth();
    }
}
