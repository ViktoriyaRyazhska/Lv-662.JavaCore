package l9HWQ1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {
	
	public static Set<String> intersect(Set<String> s1, Set<String> s2) {
		
		Set<String> ret = new HashSet<String>();
		
		Iterator<String> iterator = s2.iterator();
		
		while(iterator.hasNext()) {
			String val = iterator.next();
			if(s1.contains(val)) {
			ret.add(val);
			}
		}
		
		System.out.println("Intersect: " + ret);
		return ret;
		
	}

}
