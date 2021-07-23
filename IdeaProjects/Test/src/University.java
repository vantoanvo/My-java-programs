import java.util.Scanner;
public class University {
    private String name;
    private String state;
    private String country;
    public University(String name, String state, String country) {
        this.name = name;
        this.state = state;
        this.country = country;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setState(String newState) {
        this.state = newState;
    }
    public void setCountry(String newCountry) {
        this.country = newCountry;
    }
    public String getName(){
        return name;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
    public String toString(){
        return this.name + this.state + this.country;
    }
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
        University abc = new University(universityName, universityState, universityCountry);
        System.out.println("The university's information is: /n" + "/tName: "+
                abc.getName()+ "/n/tState: "+ abc.getState() +" /n/tCountry: "+ abc.getCountry());
   }
}
