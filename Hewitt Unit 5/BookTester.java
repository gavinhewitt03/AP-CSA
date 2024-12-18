//Run this class to test the appropriate methods in the 
//Book class

public class BookTester
{
    public static void main(String[] args)
    {
        Author juster = new Author("Norton Juster","Norton.Juster@conclusions.com","male");
        Book awesome = new Book("Phantom Tollbooth",juster,7.99);
        
        awesome.setPrice(9.99);
        System.out.println("The name of the book is:\t" + awesome.getTitle());
        System.out.println("The price of the book is:\t$" + awesome.getPrice());
        System.out.println("The name of the author is:\t" + awesome.getAuthorName());        
        System.out.println("The author's email is:\t\t" + awesome.getAuthorEmail());
        System.out.println("The author's gender is:\t\t" + awesome.getAuthorGender());
    }
}
