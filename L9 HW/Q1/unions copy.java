package l9HWQ1;
import java.util.*;

public class unions {
	
	public static Set<String> union(Set<String> s1, Set<String> s2) {

		Set<String> ret = new HashSet<String>();
		
		Iterator<String> iterator1 = s1.iterator();
		Iterator<String> iterator2 = s2.iterator();
		
		while(iterator1.hasNext()) {
			ret.add(iterator1.next());
		}
		while(iterator2.hasNext()) {
			ret.add(iterator2.next());
		}
		
		System.out.println("Union: " + ret);
		return ret;
		
	}
}
