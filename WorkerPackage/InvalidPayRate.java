//Michelle Pinnock

public class InvalidPayRate extends Exception
{
   public InvalidPayRate()
   {
      super("Error: Invalid pay rate was entered.");
   }
   public InvalidPayRate(double payRate)
   {
      super("Error: Invalid pay rate was entered: " + payRate);
   }
}
