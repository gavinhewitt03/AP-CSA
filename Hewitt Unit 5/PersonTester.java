public class PersonTester
{
    public static void main(String[]args)
    {
        Person john = new Person();
        Person jacob = new Person("Jacob", "Karkowski");
        Person harry = new Person("Harry", "Meagher");
        
        jacob.setLast("Meagher");
        harry.setLast("Karkowski");
        
        john.printFullName();
        jacob.printFullName();
        harry.printFullName();
        
        System.out.println("The number of person objects created: " +
                            Person.getNumOfPeople());
    }
}