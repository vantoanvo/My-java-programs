//This is my first Java program.
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class MyFirstJava
{
  public static void main(String[] args)
  {
   double discountRate = 0.0;
   int purchase = 1250;
   char cust ='N';
   if (purchase>1000)
     if (cust == 'Y')
     discountRate = .05;
     else
     discountRate = .04;
     else if (purchase>750)
     if (cust == 'Y')
     discountRate = .09;
     else
     discountRate =.08;
     else
     discountRate = 0;
     System.out.println(discountRate);
}
}
