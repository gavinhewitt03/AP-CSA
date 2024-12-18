
/**
 * Subclass of superclass Pet.
 *
 * @author Gavin Hewitt
 * @version 03/29/2021
 */
public class Cat extends Pet
{
    private boolean snuggly;
    
    public Cat(String n, int a, boolean s)
    {
        super(n, a);
        snuggly = s;
    }
    
    public boolean getSnuggly()
    {
        return snuggly;
    }
    
    public void setSnuggly(boolean s)
    {
        snuggly = s;
    }
    
    public void makeNoise()
    {
        System.out.println("I am meowing.");
    }
    
    public void eat()
    {
        System.out.println("I am eating fancy feast cat food.");
    }
    
    public void poop()
    {
        System.out.println("I am dropping a deuce in sand.");
    }
    
    public String toString()
    {
        return "My name is " + getName() + ", I am " + getAge() + " years old, and the status of my snuggly claws is " + snuggly + ".";
    }
}
