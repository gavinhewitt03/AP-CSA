
/**
 * This is a driver class that utilizes both Book and Author objects and utilizes their prespective methods.
 *
 * @author Gavin Hewitt
 * @version 01/08/2021
 */
public class BookDriver
{
    public static void main(String[] args)
    {
        //female is a sex so I opted for woman
        Author hl = new Author("Harper Lee", "harpercollins.en.cs@digitalriver.com", "Woman");
        Book tkam = new Book("To Kill a Mockingbird", hl, 11.99);
        
        tkam.setPrice(10.99);
        System.out.println("Author: " + tkam.getAuthorName());
        System.out.println("Email: " + tkam.getAuthorEmail());
        System.out.println("Gender: " + tkam.getAuthorGender());
        System.out.println("Title: " + tkam.getTitle());
        System.out.println("Price: " + tkam.getPrice());
    }
}
