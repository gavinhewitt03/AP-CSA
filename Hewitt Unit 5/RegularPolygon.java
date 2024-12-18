
/**
 * This class creates a RegularPolygon object that is both equilateral and equiangular.
 *
 * @author Gavin Hewitt
 * @version 01/05/2021
 */
public class RegularPolygon
{
    private int n;
    private double side;
    
    public RegularPolygon()
    {
        n = 3;
        side = 1;
    }
    
    public RegularPolygon(int s, double q)
    {
        n = s;
        side = q;
    }
    
    public int getN()
    {
        return n;
    }
    
    public void setN(int s)
    {
        n = s;
    }
    
    public double getSide()
    {
        return side;
    }
    
    public void setSide(double q)
    {
        side = q;
    }
    
    public double getPerimeter()
    {
        return n * side;
    }
    
    public double getInteriorAngle()
    {
        return 180 - (360 / n);
    }
    
    public double getArea()
    {
        double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        area = (int)(area * 100);
        area /= 100;
        return area;
    }
}
