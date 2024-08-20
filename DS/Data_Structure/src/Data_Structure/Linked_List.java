package Data_Structure;
import java.util.*;


class LL {
	Node head;
	Node tail;
	int size;

	public LL() {
		this.size = 0;
	}

	class Node {
		int data;
		Node next;
		Node(int val) {
			this.data = val;
		}
		Node(int val , Node next) {
			this.data = val;
			this.next = next;
		}
	}

	public void insertFirst(int data) {
		Node n1 = new Node(data);
		n1.next = head;
		head = n1;
		System.out.println("Inserted in beginning " + data);
		if (tail == null) {
            tail = head;
        }
		size++;
	}

	public void insertLast(int data) {
		if (tail == null) {
			insertFirst(data);
			return;
		}
		Node n2 = new Node(data);
		tail.next = n2;
		tail = n2;
		System.out.println("Inserted at last " + data);
		size++;
	}

	public void insert(int data, int index) {
		if (index == 0) {
			insertFirst(data);
		} 
		if (index == size) {
            insertLast(data);
            return;
        }
		else {
			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			Node node = new Node(data , temp.next);
			temp.next = node;
			System.out.println("Inserted at index " + index + " " + data);
			size++;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->" );
			temp = temp.next;
		}
		System.out.println("END");
	}

}

public class Linked_List {
	public static void main(String[] args) {
		LL a = new LL();
		a.insertFirst(10);
		a.insertFirst(20);
		a.insertLast(40);
		a.insertLast(60);
		a.insert(100,1);
		a.display();
	}
}