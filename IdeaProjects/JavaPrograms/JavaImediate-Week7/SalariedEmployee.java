public class SalariedEmployee extends Employee{
    private double salary;
    //Constructors set values for salary and inherited variables
    public SalariedEmployee(double salary, String firstName, String lastName){
        super(firstName, lastName);
        setFirstName("Van Toan");
        setLastName("Vo");
        this.salary = salary;
    }
    //toString method to return and print out the salary
    // and first name, last name using get methods
    public String toString(){
        return salary + " "+ super.getFirstName() + " " + super.getLastName();
    }
    //override abstract methods from Employee abstract class
    @Override
    public double getSalary(){
        return salary;
    }
    @Override
    public void setSalary(double salary){
        this.salary = salary;
    }
}
