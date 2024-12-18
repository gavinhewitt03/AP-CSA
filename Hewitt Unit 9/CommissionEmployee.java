
/**
 * Extends superclass Employee.
 *
 * @author Gavin Hewitt
 * @version 04/01/2021
 */
public class CommissionEmployee extends Employee
{
    private double rate, sales;
    
    public CommissionEmployee(String n, String d, double p, double r, double s)
    {
        super(n, d, p);
        rate = r;
        sales = s;
    }
    
    public double getRate()
    {
        return rate;
    }
    
    public void setRate(double r)
    {
        rate = r;
    }
    
    public double getSales()
    {
        return sales;
    }
    
    public void setSales(double s)
    {
        sales = s;
    }
    
    public double getWeeklyPay(int h)
    {
        return super.getWeeklyPay(h) + rate * sales;
    }
    
    public String toString()
    {
        return super.toString() + "\nRate: " + rate + " \nSales: " + sales;
    }
}
