public class Convertible extends Vehicle {
    private String model;
    private String country;
    public Convertible (String name, int year, String model, String country){
        super(name, year);
        this.model = model;
        this.country = country;
    }
    public void setModel(String newModel){

        this.model = newModel;
    }
    public String getModel(){

        return model;
    }
    public void setCountry(String newCountry){

        this.country = newCountry;
    }
    public String getCountry(){

        return country;
    }
    public String toString(){
        return "The new vehicle name is " + getName() + "\nThe year is "+ getYear() +
                "\nThe model is " + getModel() + "\nThe country is "+ getCountry();
    }
}
