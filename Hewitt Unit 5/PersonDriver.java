
/**
 * This class is a driver class for the Person class.
 *
 * @author Gavin Hewitt
 * @version 01/09/2021
 */
public class PersonDriver
{
    public static void main(String[] args)
    {
        Person john = new Person();
        Person me = new Person("Gavin", "Hewitt");
        Person michael = new Person("Michael", "Nastro");
        
        me.setLast("Nastro");
        michael.setLast("Hewitt");
        
        john.printFullName();
        me.printFullName();
        michael.printFullName();
        System.out.println(Person.getNumOfPeople());
    }
}
