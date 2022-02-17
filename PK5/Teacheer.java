package java23;

public class Teacheer extends Staff {
	  String t = "Учитель";

	    public Teacheer(String name) {
	        super(name);
	    }

	    @Override
	    void print() {
	        System.out.println(t + ", его имя: " + name);

	    }

	    @Override
	    void salary() {
	        System.out.println(" Зарплата: 10000000" );

	    }
}
