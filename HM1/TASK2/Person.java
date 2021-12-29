package Task_2HM;

public class Person {

    //private fields

    private String firstName;
    private String lastName;
    private int birthYear;

    //public fields

    public static  int year = 2021;

    //properties for access to these fields


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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // constructor

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods

    public int getAge(int birthYear){ return  year - birthYear; }

    public void input(String lastName , String firstName , int birthYear){
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;

    }

    public String output (){
        return ("firstName = " + firstName + " , lastName = " + lastName + " , birthYear = " + birthYear);
    }

    public void  changeName(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
