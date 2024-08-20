package Sets_code;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class Sets_toArray {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
        s1.add("mohit");
        s1.add("rahul");
        s1.add("aman");
        s1.add("sukdeep");
        System.out.println("Set s1 is"+  s1);
        String[] Array1 = new String[s1.size()];
        s1.toArray(Array1);
        for(String arr:Array1) {
        	System.out.println(arr);
        }
	}

}
