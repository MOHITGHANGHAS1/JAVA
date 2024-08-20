package Array_List;
import java.util.ArrayList;
import java.util.*;
public class for_each {

	public static void main(String[] args) {
		
		  ArrayList<String> a1 = new ArrayList<String>();
	         a1.add("rahul");
	         a1.add("kunal");
	         a1.add("ravi");
	         a1.add("punit");
           System.out.println("Returning Element " + a1.get(1));
	         System.out.println("Returning Element " + a1.get(2));
	         a1.set(1,"anup");
	         a1.set(2,"sonu");
//	         for(String Moral:a1){
//	             System.out.println(Moral);
//	         }
	         a1.forEach((n) -> print(n));
	         
	         

	}
	public static void print(String n) {
 	 System.out.println("Student Name is "+n);
	}

}
