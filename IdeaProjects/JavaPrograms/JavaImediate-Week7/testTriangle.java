public class testTriangle {
    public static void main (String [] args){
        //Test the toString method
        System.out.println("Testing the Triangle class ... ");
        Triangle abc = new Triangle(3, 2);
        System.out.println(abc);
        //Test the set methods
        System.out.println("Testing for the set methods ...");
        abc.setBase(5.5);
        abc.setHeight(3.5);
        //Print out the result using the get methods
        System.out.println("Already set new values ... " + "\nNow print out the result using the get methods: ");
        System.out.println("The base is: " + abc.getBase() + "\nThe height is: "+ abc.getHeight() +
                "\nThe area is: " + abc.getArea());
    }
}
