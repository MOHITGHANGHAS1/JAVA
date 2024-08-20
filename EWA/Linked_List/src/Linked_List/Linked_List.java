package Linked_List;

import java.util.*;
public class Linked_List 
{

	public static void main(String[] args)
	{
		LinkedList<String> a1= new LinkedList<String>();
		a1.add("mohit");
		a1.add("sunny");
		a1.add("akul");
		a1.add("yash");
		
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(a1.indexOf("mohit"));
		//System.out.println(a1.addressOf());

	}

}
