package CL2;

public class Cat implements Animal{
	
	String voice = "quiet";
	int feed = 50;

	@Override
	public String getVoice() {
		return "quiet";
	}

	@Override
	public int getFeed() {
		return 50;
	}

	@Override
	public String toString() {
		return "Cat [getVoice()=" + getVoice() + ", getFeed()=" + getFeed() + "]";
	}
	

}
