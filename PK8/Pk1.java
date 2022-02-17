package pk8;


public class Pk1 {
	 public static boolean isSub(String s1, String s2) {
	        return s2.contains(s1);
	    }

	    public static void main(String[] args) {
	      
	        String strOne = "Academy";
	        String strTwo = "IT Academy";
	        System.out.println(isSub(strOne, strTwo));

	    }
}
