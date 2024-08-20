//We have got one set the element of set are , you have to check whether set 2 is subset of set 1
package Sets_code;

import java.util.HashSet;
import java.util.Set;

public class Sets_SubSet {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		System.out.println("s1 set is "+ s1);
		
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(2);
		s2.add(3);
			
		System.out.println("s2 set is "+ s2);
		
		System.out.println("s2 is subset of s1 "+ s1.containsAll(s2));
	}

}
