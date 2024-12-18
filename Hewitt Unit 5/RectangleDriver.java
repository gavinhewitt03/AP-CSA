
/**
 * This is a driver class for the Rectangle class.
 *
 * @author Gavin Hewitt
 * @version 01/05/2021
 */
public class RectangleDriver
{
    public static void main(String[] args)
    {
        Rectangle x = new Rectangle(4, 40);
        Rectangle y = new Rectangle(3.5, 35.9);
        
        System.out.println("The width of the first Rectangle is " + x.getWidth() + " inches.");
        System.out.println("The length of the first Rectangle is " + x.getLength() + " inches.");
        System.out.println("The area of the first Rectangle is " + x.getArea() + " inches.");
        System.out.println("The perimeter of the first Rectangle is " + x.getPerimeter() + " inches.");
        
        System.out.println();
        
        System.out.println("The width of the second Rectangle is " + y.getWidth() + " inches.");
        System.out.println("The length of the second Rectangle is " + y.getWidth() + " inches.");
        System.out.println("The area of the second Rectangle is " + y.getArea() + " inches.");
        System.out.println("The perimeter of the second Rectangle is " + y.getPerimeter() + " inches.");
    }
}
