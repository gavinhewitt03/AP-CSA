
/**
 * This class creates Author objects and their prespective methods.
 *
 * @author Gavin Hewitt
 * @version 01/08/2021
 */
public class Author
{
    private String name, email, gender;
    
    public Author(String n, String e, String g)
    {
        name = n;
        email = e;
        gender = g;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String e)
    {
        email = e;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setGender(String g)
    {
        gender = g;
    }
    
    public String toString()
    {
        return "The author's name is " + name + ", their email is " + email + ", and their gender is " + gender + ".";
    }
}
