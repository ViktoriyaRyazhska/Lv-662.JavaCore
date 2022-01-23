package java23;

public class Student extends Person {
  String s = "Студент";
	
    public Student(String name) {
        super(name);
    }
    @Override
    void print() {
        System.out.println( s +  ", его имя: " + name);
    }
}