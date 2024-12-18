
/**
 * Write a description of class RectangularPrismTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangularPrismTest
{
    public static void main(String[] args)
    {
        Rectangle q = new Rectangle(2, 2);
        RectangularPrism f = new RectangularPrism(3, 3, 3);
        
        /**
        System.out.println("Area: " + q.getArea());
        System.out.println("Diagonal: " + q.getDiagonal());
        System.out.println("Perimeter: " + q.getPerimeter());
        System.out.println(q.toString());
        */
       
        System.out.println("Surface Area: " + f.getArea());
        System.out.println("Diagonal: " + f.getDiagonal());
        System.out.println("Volume: " + f.getVolume());
        System.out.println("Cube: " + f.isCube());
        System.out.println(f.toString());
    }
}
