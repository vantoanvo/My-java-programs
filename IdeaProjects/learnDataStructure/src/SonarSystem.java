import java.util.*;
public class SonarSystem {
    public static void main(String[] args){
        Employee abc = new Employee(12, "Rin");
        Vector v = new Vector();
        v.addElement(1);
        v.addElement("Rin");
        v.addElement(abc);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
