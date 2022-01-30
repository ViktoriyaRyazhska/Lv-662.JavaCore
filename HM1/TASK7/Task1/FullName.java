package Task_7HM.Task1;

public class FullName {

    //fields
    private String firstName;
    private String lastName;

    FullName(){}

    FullName(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
