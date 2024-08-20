package Linked_List;
import java.util.*;
public class Linkedlist_Int {

		public static void main(String[] args) {
			LinkedList<Integer> a1= new LinkedList<Integer>();
			a1.add(10);
			a1.add(20);
			a1.add(30);
			a1.add(40);
			a1.add(50);
			Iterator itr = a1.iterator();
			while(itr.hasNext()) 
			{
			System.out.println(itr.next());
		    }
			
			System.out.println("Descending order......");

			Iterator itr1 = a1.descendingIterator();
			while(itr1.hasNext()) 
			{
			System.out.println(itr1.next());
		    }
			

	}
		}
