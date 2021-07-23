/** this program demonstates the rectangle class's setLength method.
*/

public class LengthDemo
{
public static void main  (String [] args)
{//Create a Rectangle object and assign its address to the box variable.
Rectangle box = new Rectangle();
//Indicate what we are doing.
box.setLength(10.0);
box.setWidth(20.0);
// Indicate we are done.
System.out.println("The box's length is " + box.getLength());
System.out.println("The box's width is " + box.getWidth());
System.out.println("The box's area is " + box.getArea());
}
}
