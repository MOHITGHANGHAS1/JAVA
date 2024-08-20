package Stack;

import java.util.*;
public class Stack_Size_Capacity {

	public static void main(String[] args) {
		Stack<Integer> str = new Stack<Integer>();
		str.push(1);
		str.push(2);
		str.push(3);
		str.push(4);
		
		System.out.println("Size of my stack is " + str.size());
		System.out.println("Capacity of my stack is " + str.capacity());
		

	}

}

