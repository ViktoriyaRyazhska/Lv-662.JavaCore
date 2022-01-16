package l5HWQ4;

public class Car {
	
	public String type;
	public int year;
	public int engine;
	
	Car() {}
	
	Car(String type, int year, int engine) {
		setType(type);
		setYear(year);
		setEngine(engine);
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getEngine() {
		return this.engine;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setEngine(int eng) {
		this.engine = eng;
	}

}
