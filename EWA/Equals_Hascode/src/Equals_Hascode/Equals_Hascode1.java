package Equals_Hascode;

public class Equals_Hascode1 {

	public static void main(String[] args) {
		String a= "WebApplication";
		String b = "WebApplication";
		
		if(a.equals(b)) 
		{
			System.out.println("a & b are equal variable then  their respective hashvalue are " + " "+a.hashCode()+" & " +b.hashCode());
		}
		String c= "rahul";
		String d= "aman";
		if(!c.equals(d)) 
		{
			System.out.println("a & b are not equal variable then  their respective hashvalue are " + " "+a.hashCode()+" & " +b.hashCode());
		}
		
		
	}

}
