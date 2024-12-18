
/**
 * This class creates Book objects and their prespective methods.
 *
 * @author Gavin Hewitt
 * @version 01/08/2021
 */
public class Book
{
    private String title;
    private Author author;
    private double price;
    
    public Book(String t, Author a, double p)
    {
        title = t;
        author = a;
        price = p;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public String getAuthorName()
    {
        return author.getName();
    }
    
    public String getAuthorEmail()
    {
        return author.getEmail();
    }
    
    public String getAuthorGender()
    {
        return author.getGender();
    }
}
