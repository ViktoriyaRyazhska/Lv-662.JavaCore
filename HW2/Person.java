package HW2;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public static int year = 2021;

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public int getAge(){
        return year - birthYear;
    }

    public void input(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String output(){
        return "Person  name: " + firstName + " " + lastName + "; birthday year : " + birthYear +"";
    }

    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
}
