//Run this class to test the appropriate methods in the 
//RegularPolygon class

public class RegularPolygonTester
{
    public static void main(String[] args)
    {
        RegularPolygon myPolygon = new RegularPolygon(12,6);
        
        System.out.println("Number of sides: " + myPolygon.getN());
        System.out.println("Side length: " + myPolygon.getSide() + " inches");
        System.out.println("Perimeter: " + myPolygon.getPerimeter() + " inches");
        System.out.println("Area: " + myPolygon.getArea() + " inches squared");
    
        RegularPolygon myPolygon2 = new RegularPolygon(8,5.5);
        
        System.out.println("\nNumber of sides: " + myPolygon2.getN());
        System.out.println("Side length: " + myPolygon2.getSide() + " inches");
        System.out.println("Perimeter: " + myPolygon2.getPerimeter() + " inches");
        System.out.println("Area: " + myPolygon2.getArea() + " inches squared");
    
        myPolygon.setN(10);
        myPolygon.setSide(12.5);
    
        System.out.println("\nNumber of sides: " + myPolygon.getN());
        System.out.println("Side length: " + myPolygon.getSide() + " inches");
        System.out.println("Perimeter: " + myPolygon.getPerimeter() + " inches");
        System.out.println("Area: " + myPolygon.getArea() + " inches squared");  
    }
}