
/**
 * Subclass of superclass Dog.
 *
 * @author Gavin Hewitt
 * @version 03/30/2021
 */
public class GeniusDog extends Dog
{
    private int iq;
    
    public GeniusDog(String n, int a, boolean g, int i)
    {
        super(n, a, g);
        iq = i;
    }
    
    public int getIQ()
    {
        return iq;
    }
    
    public void setIQ(int i)
    {
        iq = i;
    }
    
    public void makeNoise()
    {
        System.out.println("I am barking but since I am an intellectual, it is at some random squirrel- not nothing.");
    }
    
    public void poop()
    {
        System.out.println("I am pooping in the toilet, as an intellectual does.");
    }
    
    public void eat()
    {
        System.out.println("I am eating at a fancy Italian restaurant that I drove my Tesla to.");
    }
    
    public String toString()
    {
        return "My name is " + getName() + ", I am " + getAge() + " years old, it is " + getGoodDog() + " that I am a good dog, and my IQ is " + iq + ".";
    }
}
