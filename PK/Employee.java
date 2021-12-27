package java3;

public class Employee {
	
private static int totalSum;
private String name;
private int rait;
private int hours;


public Employee(String name, int rait, int hours) {
	this.name = name;
	this.rait = rait;
	this.hours = hours;
	
}
public Employee(String name, int rait) {
	this.name = name;
	this.rait = rait;	
}


public Employee() {

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRait() {
	return rait;
}

public void setRait(int rait) {
	this.rait = rait;
}
public int getHours() {
	return hours;
}

public void setHours(int hours) {
	this.hours = hours;
}
public int getSalary() {
	return rait * hours;
}
public int changeRate9(int rait,int hours) {
	this.rait = rait;
	return rait * hours;
}
public double getBonuses() {
	return (rait * hours * 0.1);
}
@Override
public String toString() {
	return "Employee [name=" + name + ", rait=" + rait + ",hours="+hours+"]";
}
public static int getTotalSum() {
	return totalSum;
}
}




