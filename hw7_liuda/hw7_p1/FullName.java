package hw7_p1;

public class FullName {
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return "FullName: " + firstName + " " + lastName;
    }


}
