public class University {
    private String name;
    private String state;
    private String country;
    public University() {
    }
    public University(String name, String state, String country) {
        this.name = name;
        this.state = state;
        this.country = country;
    }
    public void setName(String newName) {

        this.name = newName;
    }
    public void setState(String newState) {

        this.state = newState;
    }
    public void setCountry(String newCountry) {

        this.country = newCountry;
    }
    public String getName(){

        return name;
    }
    public String getState(){

        return state;
    }
    public String getCountry(){

        return country;
    }
    public String toString(){

        return name + " " + state + " " + country;
    }
}
