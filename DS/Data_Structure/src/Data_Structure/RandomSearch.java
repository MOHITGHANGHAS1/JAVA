package Data_Structure;

import java.util.*;

public class RandomSearch {

	public static void main(String[] args) {
		int count=0,i;
		int r=0;
		int[] A=new int[100];
		Random rand= new Random();
		for(i=0;i<99;i++) {
			A[i]= rand.nextInt(100);
		}
		for(i=0;i<99;i++) {
			System.out.println(A[i]);
		}
		long startttime =System.nanoTime();
		for(i=0;i<99;i++) {
		if(A[i]==99) {
			System.out.println("i found the number");
		}
		else {System.out.println("not found");}
		}
		long endtime = System.nanoTime();
		long Time_elapsed = endtime- startttime;
		System.out.println(Time_elapsed);

	}
		
	
}

