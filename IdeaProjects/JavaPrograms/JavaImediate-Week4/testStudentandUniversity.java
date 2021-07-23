import java.util.Scanner;
public class testStudentandUniversity {
    // Main method
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        // Test the University class
        //Enter input data for the University class
        System.out.println("This program will receive and print out the information of students and their university, " +
                "please enter the information as follow:  ");
        System.out.print("Enter the university name: ");
        String universityName = input.nextLine();
        System.out.print("Enter the state this university is located: ");
        String universityState = input.nextLine();
        System.out.print("Enter the country this university is located: ");
        String universityCountry = input.nextLine();

        // Create new object for the University class
        University test = new University(universityName, universityState, universityCountry);

        // Test the get methods for the University class
        System.out.println("... Testing for the get method of the University class: ");
        System.out.println("The university's information is: \n" + "\tName: " +
                test.getName() + "\n\tState: " + test.getState() + " \n\tCountry: " + test.getCountry());

        // Test the set method with new information
        System.out.println("... Testing for the set method of the University class, using this default " +
                "information for the University: ");
        test.setName("Miramar College");
        test.setState("California");
        test.setCountry("USA");
        System.out.println(test);

        // Test Student class
        // Enter input data for the Student class
        System.out.print("Enter student's first name: ");
        String firstname = input.nextLine();
        System.out.print("Enter student's last name: ");
        String lastname = input.nextLine();
        System.out.print("Enter student's age: ");
        int studentAge = input.nextInt();

        // Create new object for the Student class
        Student abc = new Student(firstname, lastname, studentAge, test);
        //Test the get method for the Student class
        System.out.println("...Testing for the get method of the Student class: ");
        System.out.println("The student information is: \n"+ "\tFirst Name: " + abc.getFirstName() + "\n\tLast Name: " +
        abc.getLastName() + "\n\tAge: "+ abc.getAge() + "\n\tUniversity: "+ abc.getUniversity().getName());
    }
}
