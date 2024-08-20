package Sets_code;
import java.util.*;
public class Sets_TreeSet {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<Integer>();
		//adding the element
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		System.out.println("Set using treeSet "+ numbers );
		//Access Element using Iterator
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println("By Iterating " +itr.next() );
			System.out.println(",");
			}
	 Iterator<Integer> itr1 = ((TreeSet<Integer>) numbers).descendingIterator();

	       while(itr1.hasNext()) 
	       {
	    	   System.out.println("By Descending Iterating " +itr1.next() );
	    		System.out.println(",");
	       }

		
		
		
	}

}
