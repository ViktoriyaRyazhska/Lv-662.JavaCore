package l13HWQ1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("I", "IIIII", "IIIIIIII", "I", "IIIIIIIIIIII"));
		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
		list2.removeIf(n -> (n.length() >  5));
		System.out.println(list2);

	}

}
