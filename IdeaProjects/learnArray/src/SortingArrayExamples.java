import java.util.*;

public class SortingArrayExamples {
    public static void main(String[] args) {
        List<Employee> abc = new ArrayList<>();
        abc.add(new Employee(12, "Run", 1));
        abc.add(new Employee(1, "haha", 4));
        System.out.println("Before sort: " + abc);
        Comparator<Employee> em = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getId()<o2.getId()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(abc, em);
        for(Employee t: abc){
            System.out.println(t);
        }
    }
}