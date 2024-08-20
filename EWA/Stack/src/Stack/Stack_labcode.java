package Stack;

import java.util.*;
public class Stack_labcode {
	private int arr[];
	private int top;
	private int capacity;
	Stack_labcode(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
		
	}
	public void push(int x) {
		if(isFull()) {
			System.out.println("SYSTEM OVERFLOW");
			System.exit(1);
		}
		System.out.println("Inserting" + x);
		arr[++top] = x ;
	}
	  public int pop() {
	        if (isEmpty()) {
	            System.out.println("STACK EMPTY");
	            System.exit(1);
	        }
	        return arr[top--];
	    }

	public void printstack() {
		for(int i = 0; i<=top ; i++) {
			System.out.println(arr[i] + ",");
		}
	}
	 public boolean isFull() {
	        return top == capacity - 1;
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	

	public static void main(String[] args) {
		Stack_labcode stack= new Stack_labcode(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("STACK: ");
		stack.printstack();
		stack.pop();
	    System.out.println("After popping out");
	    stack.printstack();

		

	}

}
