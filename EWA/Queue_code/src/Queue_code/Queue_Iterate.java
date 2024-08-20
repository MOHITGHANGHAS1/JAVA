package Queue_code;
import java.util.*;
public class Queue_Iterate {

	public static void main(String[] args) {
		PriorityQueue<String> que = new PriorityQueue<String>();
		que.add("hello");
		que.offer("how");
		que.add("are");
		que.offer("you");
		que.offer("myfriend");
		Iterator itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		que.remove();
		que.poll();
		System.out.println("\n\n\nafter removing element");
		Iterator itr1 = que.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
