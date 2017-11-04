//Michelle Pinnock

public class InvalidEmployeeNumber extends Exception
{
   public InvalidEmployeeNumber()
   {
      super("Error: Invalid employee number entered.");
   }
   public InvalidEmployeeNumber(String number)
   {
      super("Error: Invalid employee number entered: " + number);
   }
}
