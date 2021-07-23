public class Triangle {
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){

        return height;
    }
    public void area(){
        double area = 0.5*base*height;
        System.out.println("The triangle's area is " + area);
    }
    public String toString(){

        return "The base is " + base + "\n" + "The height is " + height;
    }
}
