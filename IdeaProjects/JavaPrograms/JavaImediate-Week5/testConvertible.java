public class testConvertible {
    public static void main (String [] args){
        /**Testing for getters */
        System.out.println("Default information Car 1: ");
        Vehicle Car1 = new Vehicle("Tesla", 2020);
        System.out.println(Car1 + "\n");

        /**Testing for setters */
        System.out.println("Set new values for Car 1: ");
        Car1.setName("Tesla SUV");
        Car1.setYear(2021);
        System.out.println(Car1 + "\n");

       /**Testing for getters */
        System.out.println("Default information Car 2: ");
        Convertible Car2 = new Convertible("Mercedes", 2020, "C300", "Germany");
        System.out.println(Car2 + "\n"); // Testing the getters in Vehicle and Convertible class

       /**Testing for setters*/
        System.out.println("Set new values for Car 2: ");
        Car2.setName("Mercedes SUV");
        Car2.setYear(2021);
        Car2.setCountry("America");
        Car2.setModel("C230");
        System.out.println(Car2 + "\n"); // Testing the getters in Vehicle and Convertible class
    }
}

