
/**
 * Subclass of superclass Pet.
 *
 * @author Gavin Hewitt
 * @version 03/30/2021
 */
public class Dog extends Pet
{
    private boolean goodDog;
    
    public Dog(String n, int a, boolean g)
    {
        super(n, a);
        goodDog = g;
    }
    
    public boolean getGoodDog()
    {
        return goodDog;
    }
    
    public void setGoodDog(boolean g)
    {
        goodDog = g;
    }
    
    public void poop()
    {
        System.out.println("I am pooping in the neighbor's garden.");
    }
    
    public void makeNoise()
    {
        System.out.println("I am barking at nothing at 3:00 in the morning. Is there a problem?");
    }
    
    public void eat()
    {
        System.out.println("I am chowing down on some dog food.");
    }
    
    public String toString()
    {
        return "My name is " + getName() + ", I am " + getAge() + " years old, and it is " + goodDog + " that I am a good dog.";
    }
}
