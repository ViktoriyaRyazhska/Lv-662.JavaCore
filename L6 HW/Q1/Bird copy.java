package l6HWQ1;

abstract public class Bird {
	protected String feathers;
	protected int layEggs;
	
	public abstract boolean fly();
	public abstract String getType();
	
	Bird() {}
	
	public String getFeathers() {
		return this.feathers;
	}
	
	public int getEggs() {
		return this.layEggs;
	}
	
	public void setFeathers(String colour) {
		this.feathers = colour;
	}
	
	public void setEggs(int number) {
		this.layEggs = number;
	}
}