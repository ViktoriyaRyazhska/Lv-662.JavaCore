package hw10;

public class App {

	public static void main(String[] args) {
		Plant[] plants=new Plant[5];
		try {
			plants[0]=new Plant(8,"short","red");
			}catch(ColorException|TypeException exception) {
				System.err.println(exception.getMessage()+" in plant 1");
			}
		try {
			plants[1]=new Plant(4,"medium","yellow");
			}catch(ColorException|TypeException exception) {
				System.err.println(exception.getMessage()+" in plant 2");
			}
		try {
			plants[2]=new Plant(7,"long","blue");
			}catch(ColorException|TypeException exception) {
				System.err.println(exception.getMessage()+" in plant 3");
			}
		try {
			plants[3]=new Plant(1,"medium","yellow");
			}catch(ColorException|TypeException exception) {
				System.err.println(exception.getMessage()+" in plant 4");
			}
		try {
			plants[4]=new Plant(11,"tall","white");
			}catch(ColorException|TypeException exception) {
				System.err.println(exception.getMessage()+" вin plant 5");
			}
		for(int i=0;i<plants.length;i++) {
			System.out.println(plants[i]);
		}
	}

}
