public class CheckPoint
{
public void message(int x)
{System.out.print("This is the first version ");
System.out.println("of the method");
}
public void message(String x)
{System.out.print("This is the second version ");
System.out.println("of the method.");
}
public static void main (String [] args)
{CheckPoint cp = new CheckPoint();
cp.message("1");
cp.message(1);
}
}