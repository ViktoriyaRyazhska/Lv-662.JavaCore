package l8HWQ1;

public class FullName {
	private String firstName;
	private String lastName;
	
	FullName() {}
	
	FullName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
