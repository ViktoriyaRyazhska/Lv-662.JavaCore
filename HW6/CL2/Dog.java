package CL2;

public class Dog implements Animal{
	
	String voice = "laud";
	int feed = 80;

	@Override
	public String getVoice() {
		return "laud";
	}

	@Override
	public int getFeed() {
		return 80;
	}

	@Override
	public String toString() {
		return "Dog [getVoice()=" + getVoice() + ", getFeed()=" + getFeed() + "]";
	}
	

}
