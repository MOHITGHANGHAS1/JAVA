package Stack;

import java.util.*;
public class Stack_firstcode {

	public static void main(String[] args) {
		
		Stack<Integer> stc = new Stack<Integer>();
		Boolean Result = stc.empty();
		System.out.println("It is Empty Stack "  + Result);
		stc.push(2);
		stc.push(3);
		stc.push(4);
		stc.push(5);
		stc.push(6);
		System.out.println("Element in Stack "  + stc);
		Result = stc.empty();
		System.out.println("It is Empty Stack  "  + Result);
		
		
		
		System.out.println("\n \n  "  );
		
		
		Stack<String> str= new Stack<String>();
		Boolean result = str.empty();
		System.out.println("It is Empty Stack "  + result);
		str.push("mohit");
		str.push("rahul");
		str.push("rohit");
		str.push("rajat");
		str.push("raman");
		System.out.println("Element in Stack "  + str);
		Result = stc.empty();
		System.out.println("It is Empty Stack "  + result );
		String a = str.peek();
		System.out.println("top element " + a  );
		str.pop();
		System.out.println("Element in Stack "  + str);
	

	}

}
