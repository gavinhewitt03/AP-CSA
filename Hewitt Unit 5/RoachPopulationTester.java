//Run this class to test the appropriate methods in the 
//RoachPopulation class

public class RoachPopulationTester
{
    public static void main(String[] args)
    {
        RoachPopulation blick = new RoachPopulation();
        RoachPopulation gross = new RoachPopulation(1500, "Tigers");
        
        blick.breed();
        blick.breed();
        blick.spray();
        
        System.out.print(blick.getName()+"'s new name is ");
        blick.setName("Bulldogs");
        System.out.println(blick.getName());
        System.out.println("\nState of current colonies:  \n");
        System.out.println(blick);
        System.out.println(gross);
        
        System.out.println("\n" + gross.getName() + " needs to be sprayed.");
        gross.spray();
        gross.spray();
        gross.spray();
        gross.spray();
        gross.spray();
        gross.spray();
        gross.spray();
        gross.spray();
        System.out.println("\n" + gross.getName() + " now has a population of "+gross.getRoaches());        
    }
}
