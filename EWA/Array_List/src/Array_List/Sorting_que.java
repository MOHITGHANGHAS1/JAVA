//Que =create an array list of five element 1.database ,2. jdbc ,3. connectivity 4.oracle 5.  no sql
//1. you have to iterate and transverse through all the element by for-each loop 
//2. you have to the sorting in ascending as well as descending order 
////you have to get the index value of each elemnt in the array list change the index value of no sql by junkings



package Array_List;
import java.util.*;
public class Sorting_que {

public static void main(String[] args) {
ArrayList<String> list1 = new ArrayList<String>();
list1.add("database");
list1.add("jdbc");
list1.add("connectivity");
list1.add("oracle");
list1.add("nosql");

System.out.println("By Iterator.....");

Iterator list2 = list1.iterator();
while(list2.hasNext()) {
	System.out.println(list2.next());
}
System.out.println("By transversing.....");

for(String javaproperties:list1) {
	System.out.println( javaproperties);}
System.out.println("By sort Ascending.....");

Collections.sort(list1);

for(String javaproperties:list1) {
	System.out.println( javaproperties);
}
System.out.println("By sort Descending.....");

Collections.sort(list1 , Collections.reverseOrder());

for(String javaproperties:list1) {
	System.out.println( javaproperties);}

// Get the index value of each element in the array list
//for (int i = 0; i < list1.size(); i++) {
// System.out.println("Index " + i + ": " + list1.get(i));
//}
System.out.println(list1.indexOf("nosql"));

// Change the value of NOSQL by GENQINS
list1.set(1,"GENQUINS");
System.out.println(list1);

System.out.println(list1.get(1));


}

private static char[] indexof(String string) {
// TODO Auto-generated method stub
return null;
}
}


//you have to get the index value of each elemnt in the array list change the index value of no sql by junkings




