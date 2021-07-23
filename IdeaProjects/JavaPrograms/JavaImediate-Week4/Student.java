public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private University university;
    public Student(String firstName, String lastName, int age, University university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.university = university;
    }
    public String getFirstName(){

        return firstName;
    }
    public String getLastName(){

        return lastName;
    }
    public int getAge(){

        return age;
    }
    public University getUniversity(){

        return university;
    }
    public String toString() {
        return "\nFirst name:" + firstName + "\nLast name:" + lastName +
                " \nAge:"+ age + "\nUniversity" + university;
    }
}
