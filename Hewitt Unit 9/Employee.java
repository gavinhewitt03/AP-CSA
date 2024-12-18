
/**
 * Creates the Employee superclass.
 *
 * @author Gavin Hewitt
 * @version 03/30/2021
 */
public class Employee
{
    private String name, department;
    private double pay;
    
    public Employee(String n, String d, double p)
    {
        name = n;
        department = d;
        pay = p;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setDepartment(String d)
    {
        department = d;
    }
    
    public double getPay()
    {
        return pay;
    }
    
    public void setPay(double p)
    {
        pay = p;
    }
    
    public double getWeeklyPay(int h)
    {
        if(h < 40)
        {
            return h * pay;
        } else
        {
            return 40 * pay;
        }
    }
    
    public String toString()
    {
        return "Name: " + name +"\nDepartment: " + department + "\nHourly Pay: "+ pay;
    }
}
