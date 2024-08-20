package Data_Structure;
import java.util.Scanner;

class Node10 {
    int data;
    Node10 next;

    public Node10(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Stack_with_LinkedList {
    Node10 top;

    public int isEmpty() {
        if (top == null) {
            return 1; // Stack is empty
        } else {
            return 0; // Stack is not empty
        }
    }

    public void push(int value) {
        Node10 newNode = new Node10(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    public void pop() {
        if (isEmpty() == 1) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int poppedValue = top.data;
        top = top.next;
        System.out.println("Popped " + poppedValue + " from the stack.");
    }

    public void peek() {
        if (isEmpty() == 1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element of the stack is: " + top.data);
        }
    }

    public void display() {
        if (isEmpty() == 1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            Node10 current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	Stack_with_LinkedList stack = new Stack_with_LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
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
                    int isEmpty = stack.isEmpty();
                    if (isEmpty == 1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
 

