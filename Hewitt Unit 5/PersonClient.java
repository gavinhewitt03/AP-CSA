
public class PersonClient
{
  public static void main(String[]args)
    {
        Person john = new Person();
        Person kathleen = new Person("Kathleen", "Kidd");
        Person gavin = new Person("Gavin", "Hewitt");
        
        kathleen.setLast("Hewitt");
        gavin.setLast("Kidd");
        
        john.printFullName();
        kathleen.printFullName();
        gavin.printFullName();
        
        System.out.println("The number of person objects created: " +
                            Person.getNumOfPeople());
    }
}
