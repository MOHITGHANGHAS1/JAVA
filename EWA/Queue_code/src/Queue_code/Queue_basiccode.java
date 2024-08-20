package Queue_code;
import java.util.*;
public class Queue_basiccode {

	public static void main(String[] args) {
		Queue<String> stc = new LinkedList<String>();
		stc.add("one");
		stc.add("two");
		stc.add("three");
		stc.add("four");
		
		
		System.out.println(stc);
		stc.remove("three");
		System.out.println(stc);
		System.out.println(stc.size());
		System.out.println(stc.contains("two"));
		
		
		
		
		

	}

}
