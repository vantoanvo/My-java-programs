import java.util.Scanner;
public class testUniversity {
    // Main method
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the university name: ");
        String universityName = keyboard.nextLine();
        System.out.println("Enter the state this university is located: ");
        String universityState = keyboard.nextLine();
        System.out.println("Enter the country this university is located: ");
        String universityCountry = keyboard.nextLine();

        // Create new object for university
        University test = new University(universityName, universityState, universityCountry);

        // Test the get methods
        System.out.println("... Testing for the getters:");
        System.out.println("The university's information is: \n" + "\tName: "+
              test.getName()+ "\n\tState: "+ test.getState() +" \n\tCountry: "+ test.getCountry());

        // Test the set methods
        System.out.println("... Testing for the setters:");
        test.setName("Miramar College");
        test.setState("California");
        test.setCountry("USA");
        System.out.println(test);
    }
}
