
/**
 * This class is a driver for the EmployeeNames class and its methods.
 *
 * @author Gavin Hewitt
 * @version 01/22/21
 */
public class EmployeeNamesTester
{
    public static void main(String[] args)
    {
        String[] last = {"Hewitt", "Kidd", "Nastro", "Haigh", "Breen", "Cox", "Burriss"};
        String[] completedNames = new String[7];
        
        completedNames = EmployeeNames.convertName(last);
        
        for(String x : completedNames)
        {
            System.out.println(x);
        }
    }
}
