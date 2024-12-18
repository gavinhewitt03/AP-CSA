
/**
 * This is a driver class for the RegularPolygon class.
 *
 * @author Gavin Hewitt
 * @version 01/05/2021
 */
public class RegularPolygonDriver
{
    public static void main(String[] args)
    {
        RegularPolygon x = new RegularPolygon(10, 4);
        RegularPolygon y = new RegularPolygon(5, 7.5);
        
        System.out.println("Number of sides: " + x.getN());
        System.out.println("Side length: " + x.getSide() + " inches");
        System.out.println("Interior angle measure: " + x.getInteriorAngle() + " degrees");
        System.out.println("Perimeter: " + x.getPerimeter() + " inches");
        System.out.println("Area: " + x.getArea() + " inches squared");
        
        System.out.println();
        
        System.out.println("Number of sides: " + y.getN());
        System.out.println("Side length: " + y.getSide() + " inches");
        System.out.println("Interior angle measure: " + y.getInteriorAngle() + " degrees");
        System.out.println("Perimeter: " + y.getPerimeter() + " inches");
        System.out.println("Area: " + y.getArea() + " inches squared");
        
        x.setN(12);
        x.setSide(15.2);
        
        System.out.println();
        
        System.out.println("Number of sides: " + x.getN());
        System.out.println("Side length: " + x.getSide() + " inches");
        System.out.println("Interior angle measure: " + x.getInteriorAngle() + " degrees");
        System.out.println("Perimeter: " + x.getPerimeter() + " inches");
        System.out.println("Area: " + x.getArea() + " inches squared");
    }
}
