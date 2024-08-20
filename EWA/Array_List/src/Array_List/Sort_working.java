package Array_List;
import java.util.*;
public class Sort_working {
	

		public static void main(String[] args) {
			List<String> list1 = new ArrayList<String>();
		    list1.add("java");
		    list1.add("is");
		    list1.add("independent");
		    list1.add("language");
		    //Sorting the list1
		    
		    Collections.sort(list1);
		    
		    for(String javaproperties:list1) {
		    	System.out.println( javaproperties);
		    }
		    System.out.println( "Sorting tha numbers..");
		    //creating Integer array
		   ArrayList<Integer> list2 = new ArrayList<Integer>();
		    list2.add(22);
		    list2.add(54);
		    list2.add(60);
		    list2.add(70);
		  //Sorting the list2
		    Collections.sort(list2);
		 
		    for(Integer javaproperties2:list2) {
		    	System.out.println( javaproperties2);
		    }

			

		}

	}


