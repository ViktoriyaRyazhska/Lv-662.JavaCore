package java4;

public class App {
	public static void main(String[] args) {
		Person s1 = new Person();
	s1.setName("olga");
	s1.setlastName("Williams");
	s1.birthYear(1995);
	
	Person s2 = new Person();
	s2.setName("alex");
	s2.setlastName("Peters");
	s2.birthYear(1984);
	
	Person s3 = new Person();
	s3.setName("Den");
	s3.setlastName("Martin ");
	s3.birthYear(1956);
	
	Person s4 = new Person();
	s4.setName("Emily");
	s4.setlastName("Davis");
	s4.birthYear(2001);
	
	Person s5 = new Person();
	s5.setName("ben");
	s5.setlastName("white");
	s5.birthYear(2001);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	
}

}
