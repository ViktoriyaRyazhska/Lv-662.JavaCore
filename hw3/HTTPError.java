package hw3;

public enum HTTPError {
	
	ERROR400("Bad Request"),
	ERROR401("Unauthorized"),
	ERROR402("Payment Required"),
	ERROR403("Forbidden"),
	ERROR404("Not Found");
	
	private final String name;

	private HTTPError(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
		
}
