//Michelle Pinnock

import java.util.Scanner;

public class InfoTest
   {
      public static void main(String[] args)
         {
            try
               {
                  Scanner keyboard = new Scanner(System.in);
                  double payRateAmt;
                  int shiftNum;
                  String number;
                 
                  ProductionWorker w1 = new ProductionWorker();
                  
                  //w1.setName("Jerry Springer");
                  //w1.setHDate("12/30/1995");
                  
                  System.out.print("Enter your four digit employee number  (EX: 9999): ");
                  number = keyboard.nextLine();
                  w1.setNumber(number);
                  
                  System.out.print("Enter shift 1 to indicate you work the day shift \nEnter shift 2 to indicate you work the night shift: ");
                  shiftNum = keyboard.nextInt();
                  ((ProductionWorker)w1).setShift(shiftNum);
                           
                  System.out.print("Enter your pay rate: ");
                  payRateAmt = keyboard.nextDouble();
                  ((ProductionWorker)w1).setPayRate(payRateAmt);
               }
            catch(InvalidEmployeeNumber e)
               {
                  System.out.println(e.getMessage());
               }
            catch(InvalidShift e)
               {
                  System.out.println(e.getMessage());
               }
            catch(InvalidPayRate e)
               {
                  System.out.println(e.getMessage());
               }
            catch(Exception e)
               {
                  System.out.println(e.getMessage());
               }
         }
   }