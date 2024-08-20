package Array_List;
import java.util.*;
public class Transverse_num {

	public static void main(String[] args) {
		
			ArrayList<Integer> list=new ArrayList<Integer>(); 
			list.add(10);
			list.add(20);
			list.add(30);
			Iterator itr =list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}

	           
	}

}
