package Multi_Threading;

import java.lang.*;
public class MT_ChangeName extends Thread{
	
	MT_ChangeName(){
		super();
	}
	MT_ChangeName(String name){
		super(name);
	}
	public void run() {
		for(int i=0 ; i<5;i++) {
			System.out.println(getName() +"i:"+i);
		}
	}
	
	
	public static void main(String[] args) {
		MT_ChangeName mt1 = new MT_ChangeName();
		MT_ChangeName mt2 = new MT_ChangeName("child2");
		System.out.println("mt1 threads initial name and priority");
		System.out.println("mt1 Name "+ mt1.getName());
		System.out.println("mt1 Priority "+ mt1.getPriority());
		System.out.println( );
		System.out.println("mt2 threads initial name and priority");
		System.out.println("mt2 Name "+ mt2.getName());
		System.out.println("mt2 Priority "+ mt2.getPriority());
		mt1.setName("newchild1");
		mt2.setName("newchild2");
		mt1.setPriority(6);
		mt2.setPriority(9);
		System.out.println( );
		System.out.println("mt1 changed initial name and priority");
		System.out.println("mt1 Name "+ mt1.getName());
		System.out.println("mt1 Priority "+ mt1.getPriority());
		System.out.println( );
		System.out.println("mt2 changed initial name and priority");
		System.out.println("mt2 Name "+ mt2.getName());
		System.out.println("mt2 Priority "+ mt2.getPriority());
		
	}

}
