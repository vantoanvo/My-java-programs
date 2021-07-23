public class testSalariedEmployee {
    public static void main(String [] args){
        //Test the SalariedEmployee class from toString method
        System.out.println("This is the result from the SalariedEmployee class...");
        SalariedEmployee abc = new SalariedEmployee(13.5, "first name", "last name");
        System.out.println(abc);
        System.out.println("Test the abstract methods and print out the result again...");
        System.out.println("Setting a new value for salary...");
        abc.setSalary(15);
        System.out.println("This is new result: " + abc.getSalary() +" "+ abc.getFirstName() +" "+ abc.getLastName());
    }
}
