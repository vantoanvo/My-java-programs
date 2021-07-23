import java.util.LinkedList;
import java.util.Queue;
public class BBQ {
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        q.add("Rin");
        q.add("Toan");
        q.add("Van");
        System.out.println(q.toArray()[2]);
        System.out.println(q);
    }
}
