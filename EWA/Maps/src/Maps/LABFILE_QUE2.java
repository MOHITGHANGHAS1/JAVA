package Maps;
import java.util.*;
public class LABFILE_QUE2 {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<String,String>();
		map.put("mohit","A");
		map.put("aman","B");
		map.put("sunny","C");
		map.put("akul","D");
		map.put("yash","A");
		map.put("drizzel","B");
		map.put("aditya","C");
		map.put("shivam","D");
		map.put("yodinder","A");
		map.put("paras","B");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println(" ");
			System.out.println("STUDENT GRADE MENU");
			System.out.println("1.Checking all student grades");
			System.out.println("2.Add Student And Grades");
			System.out.println("3.Remove Student");
			System.out.println("4.Edit grades");
			System.out.println("5.Exit");
			System.out.println(" ");
			
			int a = sc.nextInt();
			switch(a)
			{
			case 1:
			
				for(Map.Entry m:map.entrySet()) {
					
					System.out.println(m.getKey()+" : "+ m.getValue());
				}
				break;
			
			case 2:
			
				
				System.out.println("Enter Student name ");
				String b = sc.next();
				System.out.println("Enter Student grade ");
				String c = sc.next();
				map.put(b, c);
				break;
			
			case 3:
			
				System.out.println("Enter Student name for removing ");
				
				String b1 = sc.next();
				if(map.containsKey(b1))
				{
				map.remove(b1);
				}
				else
				{
					System.out.println("Student name not found ");
				}
				break;
			
			case 4:
			
				System.out.println("Enter Student name ");
				String b2 = sc.next();
				if(map.containsKey(b2))
				{
					System.out.println("Enter Student new grade ");
					String c2 = sc.next();
					map.put(b2, c2);
				}
				else
				{
					System.out.println("Student name not found ");
				}
				break;
			
			case 5:
			
				System.out.println(" Menu Closed thank you ");
				sc.close();
				System.exit(0);
				
			
			default:
				System.out.println("INVALID CHOICE");
				
			
				
			
				
			}
		}
		
		

	}

}
