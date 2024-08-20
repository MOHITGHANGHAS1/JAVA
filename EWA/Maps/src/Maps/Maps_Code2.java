package Maps;
import java.util.*;
public class Maps_Code2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1," rahul");
		map.put(2," aman");
		map.put(3," kush");
		map.put(4," rahul");
		map.put(5," rajat");
		System.out.println("before invoking remove() method");
		for(Map.Entry m:map.entrySet()) 
		{
			System.out.println(m.getKey()+ "."+m.getValue());
		}
		map.remove(2);
		System.out.println("after invoking remove() method");
		for(Map.Entry m1:map.entrySet()) 
		{
			System.out.println(m1.getKey()+ "."+m1.getValue());
		}
	}

}
