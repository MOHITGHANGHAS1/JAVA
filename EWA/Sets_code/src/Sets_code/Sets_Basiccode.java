package Sets_code;
import java.util.*;
public class Sets_Basiccode {

	public static void main(String[] args) {
	Set<Integer> set1 = new HashSet<>();
    
	set1.add(10);
	set1.add(20);
	set1.add(30);
	System.out.println("Set1: "+ set1 );
	
    Set<Integer> set2 = new HashSet<>();
    
	set2.add(30);
	set2.add(40);
	set2.add(50);
	System.out.println("Set2: "+ set2 );
	
	set2.addAll(set1);
	System.out.println("Union of both set is : " +set2 );
	
	set2.retainAll(set1);
	System.out.println("Intersection of both set is : " +set2);
	
	
//	System.out.println("set2 is subset of set1 is : " set2.contains(set1));
	
	}

}
 