import java.util.Scanner;
public class Grader
{
//this instance variable reference an array of test score
 private double [] testScores;
 // now is the constructor
 public Grader(double [] scoreArray)
 { testScores = scoreArray;//assign score argument to testScore field
 }
 public double getLowestScore()
 {
   double lowest=testScores[0];
   for(int i=1; i< testScores.length; i++)
      {if (testScores[i]<lowest)
       lowest = testScores[i];
      }
    return lowest;
 }
 public double getAverage()
 { double total = 0;
  double lowest;
  double average;
  if(testScores.length<2)
  { System.out.println("Errors: not enough element");
   average = 0;
  }
  else
  {
   for (double scores : testScores) // this is a simpler way to access each element in the array
   { total +=scores;
   }
   lowest = getLowestScore();
   total -=lowest;
  }
  average = total/testScores.length;
  return average;
}
public static void main (String [] args)
{
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter a value for the array: ");
  int x = keyboard.nextInt();
  // need to create a new array here to hold the numbers of elements
  double [] numberScores = new double [x];
  // this array now contains x elements in the array
  // we just have the numbers of garde only, need to input grade for every element
  for(int i = 0; i<numberScores.length; i++)
     {System.out.println(" Now enter your #"+(i+1)+" grade: ");
      numberScores[i] = keyboard.nextDouble();
     }
   Grader mygrader = new Grader(numberScores);
  System.out.println ("Your lowest score is: "+ mygrader.getLowestScore());
  System.out.println ("Here is your average after low grade cut: " + mygrader.getAverage());
}
}




