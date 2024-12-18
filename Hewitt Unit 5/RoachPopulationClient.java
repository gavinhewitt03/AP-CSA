public class RoachPopulationClient
{
    public static void main(String[] args)
    {
        RoachPopulation blick = new RoachPopulation();
        RoachPopulation gross = new RoachPopulation(2000, "Gamecocks");
        
        blick.breed();
        blick.breed();
        blick.breed();
        blick.spray();
        
        System.out.print(blick.getName()+"'s new name is ");
        blick.setName("Tigers");
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
        System.out.println("\n" + gross.getName() + " now has a population of "+ gross.getRoaches());        
    }
}
