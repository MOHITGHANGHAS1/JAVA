//Que. Create a stack of these five element 1. aws 2.assure 3. gcp 4.big data 5. machine learning
//now you have to 2 element from the top and you have to retrieve new element on the top	

package Stack;
import java.util.*;
public class Stack_que {

	public static void main(String[] args) {
		Stack<String> str = new Stack<String>();
		Boolean result = str.empty();
		System.out.println("THE STEACK IS EMPTY " + result);
		str.push("aws");
		str.push("assure");
		str.push("gcp");
		str.push("big data");
		str.push("machine learning");
		System.out.println("STACK HAS " + str);
		result = str.empty();
		System.out.println("THE STACK IS EMPTY " + result);
		String a = str.peek();
		System.out.println("PEEK STACK ELEMENT IS " + a);
		str.pop();
		str.pop();
		
		System.out.println("STACK HAS " + str);
		String b = str.peek();
		System.out.println("PEEK STACK ELEMENT IS " + b);
		
		
		

	}

}

