package Equals_Hascode;
import java.util.*;

class Student implements Comparable<Student>
{
	String name;
	int age ;
	int rollno ;
	Student(String name, int age, int rollno)
	{
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		
	}
	public int compareTo(Student st) {
		if (age==st.age)
			return 0;
		else if( age>st.age)
		return 1;
		else
			return -1;
		// 0 exit successfully
		// 1 exit with exception
		// -1 unsucessfully
		
	}
	
}


public class Comparable_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student> a1 = new  ArrayList<Student>();
       a1.add(new Student("mohit",10,1));
       a1.add(new Student("rahul",11,2));
       a1.add(new Student("rajat",12,3));
       Collections.sort(a1);
       for(Student st:a1) 
       {
    	   System.out.println(st.name +"/"+ st.age + "/" + st.rollno);
       }
	}

}
