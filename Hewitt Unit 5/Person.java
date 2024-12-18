
/**
 * This class creates Person objects and their prespective methods.
 *
 * @author Gavin Hewitt
 * @version 01/09/2021
 */
public class Person
{
    private String first, last;
    private static int numOfPeople;
    
    public Person()
    {
        first = "John";
        last = "Doe";
        numOfPeople++;
    }
    
    public Person(String f, String l)
    {
        first = f;
        last = l;
        numOfPeople++;
    }
    
    public void setFirst(String f)
    {
        first = f;
    }
    
    public void setLast(String l)
    {
        last = l;
    }
    
    public void printFullName()
    {
        System.out.println(first + " " + last);
    }
    
    public static int getNumOfPeople()
    {
        return numOfPeople;
    }
}
