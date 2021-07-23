
import javax.swing.JOptionPane;
/** This program demonstrates a nested if statement.
*/
public class LoanQualifier
{
  public static void main(String[] args)
    {
    String inputSalary; //Annual salary
    String inputYears;
    double salary;
    double yearsOnJob;



    //Get the user's annual salary.
    inputSalary = JOptionPane.showInputDialog("Enter your annual salary: ");
    salary = Double.parseDouble(inputSalary);
    //Get the number of years at the current job.
    inputYears = JOptionPane.showInputDialog ("Enter the number of years " + "at your current job: ");
    yearsOnJob = Double.parseDouble(inputYears);

    //Determin whether the user qualifies for the loan.
    if (salary>= 50000)
    {
       if (yearsOnJob >= 2)
        {
         System.out.println("You qualify for the loan. ");
         }
     else
        {
        System.out.println("You must have been on your " + "current job for at least " + "two years to qualify. ");
        }
      }
      else
      {
        System.out.println("You must earn at least " + "$50,000 per year to qualify.");
       }
       System.exit(0);
    }
    }