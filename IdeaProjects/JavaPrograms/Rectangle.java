/**
Rectangle class, phase 1
*/
public class Rectangle
{
private double length;
private double width;

/**
The setLength method stores a value in the length field.
*/

public void setLength(double len)
{
length = len;// write setLength method to allow code
//outside Rectangle class to store values in the fields.
}
/**
The setWidth method stores a value in the width field
*/
public void setWidth(double w)
{
width = w;// write setWidth method to allow code
//outside Rectangle class to store values in the fields.
}
public double getLength()
{
 return length;// write this method to allow code outside
//the method to get the stored values
}
public double getWidth()
{return width;// write this method to allow code outside
//the method to get the stored values
}
public double getArea()
{
	return length*width;
}
}
