
/**
 * This class is a driver class for the RoachPopulation class.
 *
 * @author Gavin Hewitt
 * @version 01/07/2021
 */
public class RoachPopulationDriver
{
    public static void main(String[] args)
    {
        RoachPopulation one = new RoachPopulation();
        one.breed();
        one.spray();
        one.breed();
        one.spray();
        one.setName("Yellow Jackets");
        System.out.println(one.toString());
        
        RoachPopulation two = new RoachPopulation(50, "Alabama");
        two.breed();
        two.spray();
        two.breed();
        two.spray();
        System.out.println(two.toString());
    }
}
