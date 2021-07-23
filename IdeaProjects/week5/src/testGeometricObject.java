public class testGeometricObject{
    /** main method*/
    public static void main (String[] args) {
        //Declare and initialize the two objects
        GeometricObject geo1 = new Circle(5);
        GeometricObject geo2 = new Rectangle(5, 10);
        System.out.println("The two objects have the same area? " + compareArea(geo1, geo2));
        //display circle
        displayGeometricObject(geo1);
        //display rectangle
        displayGeometricObject(geo2);
        System.out.println(geo1.getDateCreated() + " " + geo2.getDateCreated());
    }
        //Compare area method
        public static boolean compareArea(GeometricObject object1, GeometricObject object2){
            return object1.getArea() == object2.getArea();
        }

        //display method
        public static void displayGeometricObject (GeometricObject abc){
        System.out.println();
        System.out.println("The area is " + abc.getArea());
        System.out.println("The perimeter is " + abc.getPerimeter());
        }
}
