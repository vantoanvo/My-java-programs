import java.util.Scanner;
public class testEmployee {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        // Get the input data
        System.out.print("Please enter employee's name: ");
        String inputName = keyboard.nextLine();
        System.out.print("Please enter employee's salary: ");
        Double inputSalary = keyboard.nextDouble();
        //Create object of employee class
        Employee A = new Employee(inputName, inputSalary);
        // Test the get method
        System.out.println("... Testing for the getters: ");
        System.out.println("This is the employee information: \n"
                + "\tName:" + A.getName() + "\n\tSalary: " + A.getEmployeeSalary());
       //testing setter
        System.out.println("... Testing for the setters:");
        A.setName("Van Toan Vo");
        A.setSalary(15.5);
        System.out.println("... Testing for the toString method:");
        System.out.println(A);
    }
    }
