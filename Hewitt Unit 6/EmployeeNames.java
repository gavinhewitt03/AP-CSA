
/**
 * This class reads a list of last names in an array input by the user and returns the first and middle initial based on the last two characters of the last name provided.
 *
 * @author Gavin Hewitt
 * @version 01/22/21
 */
public class EmployeeNames
{
    public static String[] convertName(String[] a)
    {
       String[] formattedNames = a; 
       for(int i = 0; i < formattedNames.length; i++)
       {
           String last = formattedNames[i];
           String first = last.substring(last.length() - 1, last.length());
           String middle = last.substring(last.length() - 2, last.length() - 1);
           formattedNames[i] = first.toUpperCase() + ". " + middle.toUpperCase() + ". " + formattedNames[i];
       }
       
       return formattedNames;
    }
}
