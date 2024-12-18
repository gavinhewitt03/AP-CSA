
/**
 * test.
 *
 * @author Gavin Hewitt
 * @version 04/12/2021
 */

import java.util.*;
public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee bill = new Employee("Bill", "Accounting", 7.5);
        UnionEmployee frank = new UnionEmployee("Frank", "Secretary", 8.25, 100);
        CommissionEmployee joe = new CommissionEmployee("Joe", "Sales", 10, .2, 2000);
        
        ArrayList<Employee> k = new ArrayList<Employee>();
        
        k.add(bill);
        k.add(frank);
        k.add(joe);
        for(Employee x : k)
        {
            System.out.println(x.getWeeklyPay(40));
            System.out.println(x.toString());
        }
        
    }
}
