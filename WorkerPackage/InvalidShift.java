//Michelle Pinnock

public class InvalidShift extends Exception
{
   public InvalidShift()
   {
      super("Error: Invalid shift was entered.");
   }
   public InvalidShift(int shift)
   {
      super("Error: Invalid shift was entered: " + shift);
   }
}
