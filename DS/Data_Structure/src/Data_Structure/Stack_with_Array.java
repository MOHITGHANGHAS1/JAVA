package Data_Structure;

import java.util.Scanner;

public class Stack_with_Array {
    private int[] stack;
    private int top;

    public Stack_with_Array() {
        stack = new int[10]; // Initialize with a small size
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int poppedValue = stack[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.Cannot peek. ");
        } else {
            System.out.println("Top element of the stack is: " + stack[top]);
        }
    }

    public static void main(String[] args) {
    	Stack_with_Array stack = new Stack_with_Array();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

