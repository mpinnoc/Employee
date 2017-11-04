//Michelle Pinnock

import java.util.Date;
import java.text.DateFormat;

public class ProductionWorker extends Employee
   {
      private static int shift;
      private double payRate;
      private static String shiftType;
      
      public ProductionWorker()
         {
            super();
            shift = 0;
            shiftType = "";
            payRate = 0.0;
         }
      public ProductionWorker(String n, String num, String hD, int s, String sT, double p)
         {
           super(n, num, hD);
           shift = s;
           shiftType = sT;
           payRate = p;
         }    
      public void setShift(int s) throws InvalidShift
         {
            if(s == 1 || s == 2)
               shift = s;
            else
               throw new InvalidShift(s);
         }
      public int getShift()
         {
            return shift;
         }  
      public void setShiftType(String sT)
         {
            shiftType = sT;
         }
      public String getShiftType()
         {
            switch (shift)
               {
                  case 1:
                     shiftType = "Day";
                     break;
                  case 2:
                     shiftType = "Night";
                     break;
                  default:
                     System.out.println("    Error. Please enter 1 or 2");
                     
                 }  
            return shiftType;
         }
      public void setPayRate(double p) throws InvalidPayRate
         {
            if(p < 1)
               throw new InvalidPayRate(p);
            if(p > 200)
               throw new InvalidPayRate(p);
            payRate = p;
         }
      public double getPayRate()
         {
            return payRate;
         }
      public String toString()
         {
            String str = "Employee name is " + getName() 
                                               +"\nEmployee number is " + getNumber()
                                               +"\nEmployee was hired on " + getHDate()
                                               +"\nEmployee works shift: " + shift + " the " + getShiftType() + " shift"
                                               +"\nEmployee's hourly pay rate is " + payRate; 
                                   
            return str ;                       
         }
         
   }

 