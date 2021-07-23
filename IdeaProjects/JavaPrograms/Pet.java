import java.util.*;
public class Pet
{
//instance variables of the class
private String name;
private String animal;
private int age;
//let's try a constructor
public Pet(String nickName, String kind, int number) //if we don't create this constructor, the new object can't pass the arguments.
{name = nickName;
animal = kind;
age = number;
}
// main method
public static void main (String [] agrs)
{String petName;
String petAnimal;
int petAge;

// give the animal a name
Scanner keyboard = new Scanner(System.in);

//Enter the name
System.out.println("Enter the name: ");
petName=keyboard.nextLine();

//Enter type of animal
System.out.println("What is this animal? ");
petAnimal = keyboard.nextLine();

//Enter animal age
System.out.println("What age is it? ");
petAge = keyboard.nextInt();

// Create object myPet for the class
Pet myPet = new Pet(petName, petAnimal, petAge);

//here is set method
myPet.setName(petName);
myPet.setAnimal(petAnimal);
myPet.setAge(petAge);
System.out.println();

//Print out the results
System.out.println("Here is what we know about your pet: \n" + "Its name is " + myPet.getName() + " and he/she is a "+
myPet.getAnimal() + ", he/she is just " + myPet.getAge()+ "years old");
}
//other methods
public void setName(String abc)
{abc= name;
}
public void setAnimal(String bcd)
{bcd = animal;
}
public void setAge(int x)
{x = age;
}
public String getName()
{return name;
}
public String getAnimal()
{return animal;
}
public int getAge()
{return age;
}
}