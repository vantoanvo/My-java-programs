//Try the restaurant bill
import java.util.Scanner;
public class DinningBill
{
  public static void main(String[] args)
  {
   double mealCharge;
   double taxRate;
   double tip;
   double total;
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Please enter the meal charge: ");
   mealCharge = keyboard.nextDouble();
   taxRate = mealCharge*0.675;
   tip = (mealCharge+taxRate)*0.20;
   total = mealCharge + taxRate + tip;
   System.out.println ("Your meal charge is " + mealCharge +", tax " + taxRate + ",tip "+tip + ", total amount " + total);
   }
   }