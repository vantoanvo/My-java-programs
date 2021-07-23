public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    /** Construct a default geometric object */
    public GeometricObject() {

        dateCreated = new java.util.Date();
    }
    /** Construct a geometric object with color and filled value */
    protected GeometricObject (String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    /** Return color */
    public String getColor() {

        return color;
    }
    /** set color */
    public void setColor(String newColor){

        this.color = newColor;
    }
    /** Return filled. Since filled is boolean,
     * the getmethod is named isFilled
     */
    public boolean isFilled(){

        return filled;
    }
    /** Set a new filled */
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    /** get dateCreated */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return "created on" + dateCreated + "\ncolor:" + color + " and filled: " + filled;
    }
    /** abstract method getArea */
    public abstract double getArea();
    /** abstract method getPerimeter */
    public abstract double getPerimeter();
}
