public class Circle extends GeometricObject{
    private double radius;
    public Circle(){
    }
    public Circle (double radius){
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
     /**return Area*/

    public double getArea(){
        return radius*radius*Math.PI;
    }
    /**return perimeter */
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    /**return diameter */
    public double getDiameter(){
        return radius*2;
    }
    /** Print the circle information */
    public void printCircle(){
        System.out.println("The circle is created "+ getDateCreated() + "and the radius is " + radius);
    }
}
