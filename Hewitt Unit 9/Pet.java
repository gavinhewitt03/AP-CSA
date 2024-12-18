
/**
 * Superclass for several pet subclasses.
 *
 * @author Gavin Hewitt
 * @version 03/29/2021
 */
public class Pet
{
    private String name;
    private int age;
    
    public Pet(String n, int a)
    {
        name = n;
        age = a;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
    public void makeNoise()
    {
        System.out.println("I am making noise.");
    }
    
    public void eat()
    {
        System.out.println("I am eating.");
    }
    
    public void poop()
    {
        System.out.println("I am pooping.");
    }
    
    public String toString()
    {
        return "My name is " + name  + " and I am " + age + " years old.";
    }
}
