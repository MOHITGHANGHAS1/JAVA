package Linked_List;

import java.util.*;

public class boolean_contains {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
	        list.add("Amit");
	        list.add("Rahul");
	        list.add("Gaurav");
	        list.add("Sumit");
	        list.add("Jai");

	        System.out.println(list);
	        String s = "Amit";

	        boolean contains = list.contains(s);

	        if (contains) {
	            System.out.println("Element found at index: " + list.indexOf(s));
	        }

	        s = "Naveen";
	        contains = list.contains(s);

	        if (contains) 
          {
	            System.out.println("Element found at index: " + list.indexOf(s));
	        } 
	        else {
	        	System.out.println("ELEMENT NOT FOUND");
	        }

	}
}
