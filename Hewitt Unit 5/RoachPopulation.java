
/**
 * This class uses RoachPopulation objects to simulate the growth of a roach population.
 *
 * @author Gavin Hewitt
 * @version 01/07/2021
 */
public class RoachPopulation
{
    private int population;
    private String name;
    
    public RoachPopulation()
    {
        population = 100;
        name = "Gang";
    }
    
    public RoachPopulation(int x, String y)
    {
        population = x;
        name = y;
    }
    
    public void breed()
    {
        population *= 2;
    }
    
    public void spray()
    {
        population = (int)(((double)population - (double)population * .1) + 0.5);
    }
    
    public int getRoaches()
    {
        return population;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String y)
    {
        name = y;
    }
    
    public String toString()
    {
        return "The current population of the " + name + " roach colony is " + population + ".";
    }
    
}
