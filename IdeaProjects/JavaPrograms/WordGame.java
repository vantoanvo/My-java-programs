import java.util.Scanner; //Needed for the Scanner class
/**
* This program demonstrates a solution to the Word Game programming challenge.
*/

public class WordGame
{
  public static void main(String[] args)
   { //Declare all variables as Strings
   String name;
   String age;
   String city;
   String college;
   String profession;
   String animal;
   String petname;
   // Create Scanner object for keyboard input.
   Scanner keyboard = new Scanner(System.in);

   // Get the user's name.
   System.out.print("Enter your name: ");
   name = keyboard.nextLine();

   // Get the user's age.
   System.out.println("Enter your age: ");
   age = keyboard.nextLine();

   // Get the name of a city.
   System.out.println("Enter the name of a city: ");
   city = keyboard.nextLine();

   // Get the name of a college.
   System.out.println("Enter the name of a college: ");
   college = keyboard.nextLine();

   // Get a profession.
   System.out.println("Enter profession: ");
   profession = keyboard.nextLine();

   // Get a type of animal.
   System.out.println("Enter a type of animal: ");
   animal = keyboard.nextLine();

   // Get a pet name.
   System.out.println ("Enter a pet name: ");
   petname = keyboard.nextLine();

   System.out.println("There once was a person named " + name + " who lived in " +
   city + ". At the age of " + age +","+ name + " went to college at " + college + "."+ name +
   " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " +
   animal + " named " + petname+ " They both lived happily ever after!");
   }
   }