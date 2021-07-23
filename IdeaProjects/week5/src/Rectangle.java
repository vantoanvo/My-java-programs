public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    /** constructor
     */
    public Rectangle (){
    }
    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    /** return width */
    public double getWidth(){
        return width;
    }
    /** set width */
    public void setWidth(double width){
        this.width = width;
    }
    /** return height */
    public double getHeight(){
    return height;
    }
    /** set height */
    public void setHeight(double height){
        this.height = height;
    }
    @Override /**return getArea*/
    public double getArea(){
        return width*height;
    }
    @Override /** return getPerimeter */
    public double getPerimeter(){
        return (width+height)*2;
    }
}
