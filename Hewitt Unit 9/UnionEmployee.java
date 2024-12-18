
/**
 * Extends superclass Employee.
 *
 * @author Gavin Hewitt
 * @version 04/01/2021
 */
public class UnionEmployee extends Employee
{
    private double dues;
    
    public UnionEmployee(String n, String d, double p, double u)
    {
        super(n, d, p);
        dues = u;
    }
    
    public double getDues()
    {
        return dues;
    }
    
    public void setDues(double u)
    {
        dues = u;
    }
    
    public double getWeeklyPay(int h)
    {
        if(h > 40)
        {
            return super.getWeeklyPay(h) + (h - 40) * 1.5 * getPay() - dues;
        } else
        {
            return super.getWeeklyPay(h);
        }
    }
    
    public String toString()
    {
        return super.toString() + "\nDues: " + dues;
    }
}
