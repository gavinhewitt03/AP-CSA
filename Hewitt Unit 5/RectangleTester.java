//Run this class to test the appropriate methods in the 
//Rectangle class

public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle myRectangle = new Rectangle(4, 12);   
        Rectangle yourRectangle = new Rectangle(2.5, 5);
        
        myRectangle.setWidth(10);
        yourRectangle.setLength(6.5);
        
        System.out.println("The width of the first rectangle is " + 
                            + myRectangle.getWidth() + " inches.");
        System.out.println("The length of the first rectangle is " +
                            + myRectangle.getLength() + " inches.");
        System.out.println("The area of the first rectangle is " + 
                            + myRectangle.getArea() + " square inches.");
        System.out.println("The perimeter of the first rectangle is " +
                            + myRectangle.getPerimeter() + " inches.");
        System.out.println("\nThe width of the first rectangle is " + 
                            + yourRectangle.getWidth() + " inches.");
        System.out.println("The length of the first rectangle is " +
                            + yourRectangle.getLength() + " inches.");
        System.out.println("The area of the first rectangle is " + 
                            + yourRectangle.getArea()+ " square inches.");
        System.out.println("The perimeter of the first rectangle is " +
                            + yourRectangle.getPerimeter() + " inches.");
    }
}