
/**
 * Tests the Employee class.
 *
 * @author Ms. L
 * @version 1/16/20
 */
public class EmployeeRunner
{
    public static void main(String[] args)
    {
        String[] original = {"Castle", "Potter", "Moriarty", "Seuss", "Montoya"};
        String[] transformed = EmployeeNames.convertName(original);
        
        for(String curr : transformed)
        {
            System.out.println(curr);
        }
    }
}
