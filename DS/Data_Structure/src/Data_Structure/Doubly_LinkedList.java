package Data_Structure;

//import LinkedList.LL.Node;

class LL1 {
	Node head, tail;
	int size = 0;

	class Node {
		int data;
		Node next;
		Node pre;
		int size = 0;

		Node(int val) {
			this.data = val;
		}

		Node(int val, Node next) {
			this.data = val;
			this.next = next;
		}

		public void insertFirst(int data) {
			Node n1 = new Node(data);
			n1.next = head;
			n1.pre = null;
			head = n1;
			if (head != null) {
		        head.pre = n1;
			}
			System.out.println("Inserted in beginning " + data);
			size++;
		}
		public void insertLast(int data) {
			if (tail == null) {
				insertFirst(data);
				return;
			}
			Node n2 = new Node(data);
			tail.next = n2;
			tail.pre=tail;
			tail = n2;
			System.out.println("Inserted at last " + data);
			size++;
		}
		
		public void insert(int data , int index) {
			if (index == 0) {
				insertFirst(data);
			}
			if (index == size) {
				insertLast(data);
				return;}
			else {
				Node temp = head;
				for (int i = 1; i < index; i++) {
					temp = temp.next;
				}
				Node nextNode = temp.next;
				nextNode.pre=temp;
				temp.next=nextNode;
				temp.pre=nextNode;
				nextNode.next=temp;
				System.out.println("Inserted at index " + index + " " + data);
				size++;
			}
		}
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("END");
		}
	}
}

public class Doubly_LinkedList {

	public static void main(String[] args) {
		LL a = new LL();
		a.insertFirst(10);
		a.insertLast(30);
		a.insertFirst(20);
		a.insert(50,1);
		a.display();
		

	}

}
