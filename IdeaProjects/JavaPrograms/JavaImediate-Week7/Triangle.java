public class Triangle extends GeometricObject{
    //Declare variables for the Triangle class
    private double base;
    private double height;
    //Create a constructor for the Triangle class
    public Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    //Set the base of the triangle
    public void setBase(double x){
        this.base = x;
    }
    //Set the height of the triangle
    public void setHeight(double y){
        this.height = y;
    }
    //Return the base of the triangle
    public double getBase(){
        return base;
    }
    //Return the height of the triangle
    public double getHeight(){
        return height;
    }
    @Override
    public double getArea(){
    return 0.5*base*height;
    }
    public String toString(){
        return "The base is: " + base + "\nThe height is: " + height;
    }
}
