package L10;

public class Hw_task2 {
	
	public static void main(String[] args) {
		
		String sentence = "My   favorite   season   is   Autumn."; 		
		String rewritedSentence = sentence.trim().replaceAll("\\s+", " ");
		System.out.println(rewritedSentence);
		
	}
}
