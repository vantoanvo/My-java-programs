public class Employee {
    private String employeeName;
    private Double employeeSalary;
    public Employee(){
    }
    public Employee(String name, Double salary){
        this.employeeName = name;
        this.employeeSalary = salary;
    }
    public void setName(String newName){

        this.employeeName = newName;
    }
    public void setSalary(Double salary){
        this.employeeSalary = salary;
    }
    public String getName(){

        return employeeName;
    }
    public Double getEmployeeSalary(){

        return employeeSalary;
    }
    public String toString(){
        return employeeName +" "+ employeeSalary;
    }
}
