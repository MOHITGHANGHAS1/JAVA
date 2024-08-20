package Stack;

import java.util.*;
public class Stack_classcode {

	public static void main(String[] args) {
		Stack<Integer> str = new Stack<Integer>();
		str.push(40);
		str.push(50);
		str.push(60);
		str.push(70);
		while(!str.empty()) {
			System.out.println(str.peek());
			str.pop();
			System.out.println("next");
			//System.out.println(str.peek());
			
			}
		System.out.println("\n \nSEARCHING>>>>>>>> " );
		Stack<String> str1= new Stack<String>();
		
		str1.push("mohit");
		str1.push("rahul");
		str1.push("rohit");
		str1.push("rajat");
		str1.push("mohit");
		str1.push("raman");
		
		
		System.out.println("STACK: " + str1);
		int location = str1.search("mohit");
		System.out.println("LOCATION OF MOHIT " + location);
		int location2 = str1.search("MOHIT");
		System.out.println("LOCATION OF MOHIT " + location2);
		

	}

}

