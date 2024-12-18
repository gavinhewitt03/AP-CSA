
/**
 * Tests the Employee class.
 *
 * @author Ms. L
 * @version 1/16/20
 */
public class EmployeeClient
{
    public static void main(String[] args)
    {
        String[] original = {"Golightly", "Scrooge", "Finch", "Galt", "Frankenstein", "Dracula"};
        String[] transformed = EmployeeNames.convertName(original);
        
        for(String curr : transformed)
        {
            System.out.println(curr);
        }
    }
}
