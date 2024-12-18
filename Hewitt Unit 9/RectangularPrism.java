
/**
 * Write a description of class RectangularPrism here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangularPrism extends Rectangle
{
    private double height;
    
    public RectangularPrism(double l, double w, double h)
    {
        super(l, w);
        height = h;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(double h)
    {
        height = h;
    }
    
    public double getArea()
    {
        return Round.round(2 * super.getArea() + 2 * getLength() * height + 2 * getWidth() * height);
    }
    
    public double getDiagonal()
    {
        return Round.round(Math.sqrt(Math.pow(super.getDiagonal(), 2) + Math.pow(height, 2)));
    }
    
    public double getVolume()
    {
        return Round.round(super.getArea() * height);
    }
    
    public boolean isCube()
    {
        if(getLength() == getWidth() && getWidth() == height)
        {
            return true;
        }
        else
            return false;
    }
    
    public String toString()
    {
        return "The length is " + getLength() + ", the width is " + getWidth() + ", and the height is " + height;
    }
}
