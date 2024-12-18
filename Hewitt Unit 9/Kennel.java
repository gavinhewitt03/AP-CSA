
/**
 * Tests the Cat, Dog, GeniusDog, and Pet methods.
 *
 * @author Gavin Hewitt
 * @version 03/30/2021
 */
import java.util.*;
public class Kennel
{
    public static void main(String[] args)
    {
        Pet comet = new Cat("Comet", 3, true);
        Pet noel = new Dog("Noel", 14, true);
        Pet mort = new GeniusDog("Mort", 6, false, 78);
        ArrayList<Pet> yes = new ArrayList<Pet>();
        
        //adds pets to arraylist
        yes.add(comet);
        yes.add(noel);
        yes.add(mort);
        
        //tests makeNoise
        comet.makeNoise();
        noel.makeNoise();
        mort.makeNoise();
        
        System.out.println();
        //tests eat
        comet.eat();
        noel.eat();
        mort.eat();
        
        System.out.println();
        //tests poop
        for(Pet x : yes)
        {
            x.poop();
        }
        
        System.out.println();
        //tests toString
        System.out.println(comet.toString());
        System.out.println(noel.toString());
        System.out.println(mort.toString());
    }
}
