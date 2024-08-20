package Linked_List;

import java .util.*;
public class Searching 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		int n1 = 13;
		int o1 = -1;
		for (int i=0;i<l1.size();i++)
		{
			int l2 = l1.get(i);
			if(l2==n1) 
			{
				o1=i;
				break;
			}
			
		}
		if(o1==-1) 
		{
			System.out.println("number not found......");
		}
		else {System.out.println("number found......");}
		
		
		
		
	}}
