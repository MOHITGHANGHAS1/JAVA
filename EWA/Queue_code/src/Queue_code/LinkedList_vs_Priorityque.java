package Queue_code;
import java.util.*;
public class LinkedList_vs_Priorityque {

	public static void main(String[] args) {
		
		Queue<String> stc = new LinkedList<String>();
		stc.add("one");
		stc.add("two");
		stc.add("three");
		stc.add("four");
		
		
		System.out.println("queue element is "+stc);
		Iterator itr = stc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		stc.remove();
		stc.poll();
		System.out.println("after removing element in queue is "+stc);
	
		PriorityQueue<String> que = new PriorityQueue<String>();
		que.add("hello");
		que.offer("how");
		que.add("are");
		que.offer("you");
		que.offer("myfriend");
		System.out.println("\n\n\nqueue element is "+que);
		Iterator itr1 = que.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		que.remove();
		que.poll();
		System.out.println("after removing element in queue is "+que);
	
	}

}
