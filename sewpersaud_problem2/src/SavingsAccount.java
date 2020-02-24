import java.util.*;
class SavingAccount
{
   static double annualInterestRate;
   double savingsBalance;

   SavingAccount(double sb, double ai)
   {
       savingsBalance = sb;
       annualInterestRate = ai;
   }

   public void calculateMonthlyInterest()
   {
       savingsBalance = savingsBalance + (savingsBalance * 1 * annualInterestRate)/12;
       System.out.println(" New Balance = " + savingsBalance);
   }

   public static void modifyInterestRate(double d)
   {
       annualInterestRate = d;  
   }
}

class SpecialSavings extends SavingAccount
{
   
   SpecialSavings(double d, double dd)
   {
       super(d, dd);   
   }

   public static void deposit(SavingAccount sa, double d)
   {
       sa.savingsBalance = sa.savingsBalance + d;
       System.out.println("\n New Balance = " + sa.savingsBalance);
   }

   public static void withdrawls(SavingAccount sa, double w)
   {
       sa.savingsBalance = sa.savingsBalance - w;
       System.out.println("\n New Balance = " + sa.savingsBalance);
   }
   public static void newPer(SavingAccount sa)
   {
       if(sa.savingsBalance > 10000)
           sa.savingsBalance = sa.savingsBalance * .10;
       System.out.println("\n New Balance After Special Interest: " + sa.savingsBalance);
   }

}