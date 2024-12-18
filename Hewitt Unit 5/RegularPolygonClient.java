public class RegularPolygonClient
{
    public static void main(String[] args)
    {
        RegularPolygon myPolygon = new RegularPolygon(10,5);
        
        System.out.println("Number of sides: " + myPolygon.getN());
        System.out.println("Side length: " + myPolygon.getSide() + " inches");
        System.out.println("Perimeter: " + myPolygon.getPerimeter() + " inches");
        System.out.println("Area: " + myPolygon.getArea() + " inches squared");
    
        RegularPolygon myPolygon2 = new RegularPolygon(7,4.5);
        
        System.out.println("\nNumber of sides: " + myPolygon2.getN());
        System.out.println("Side length: " + myPolygon2.getSide() + " inches");
        System.out.println("Perimeter: " + myPolygon2.getPerimeter() + " inches");
        System.out.println("Area: " + myPolygon2.getArea() + " inches squared");
    
        myPolygon.setN(12);
        myPolygon.setSide(13.5);
    
        System.out.println("\nNumber of sides: " + myPolygon.getN());
        System.out.println("Side length: " + myPolygon.getSide() + " inches");
        System.out.println("Perimeter: " + myPolygon.getPerimeter() + " inches");
        System.out.println("Area: " + myPolygon.getArea() + " inches squared");  
    }
}