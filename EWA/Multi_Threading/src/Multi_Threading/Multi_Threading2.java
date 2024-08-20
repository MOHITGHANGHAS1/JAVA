package Multi_Threading;
import java.util.*;

class Threadrunnanblenewcls1 implements Runnable {
	public void run() {
		System.out.println("Thread is under running");
		for( int i = 0;i<=10;i++) {
			System.out.println("i = "+i);
		}
	}
}

public class Multi_Threading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Threadrunnanblenewcls1 threadobject = new Threadrunnanblenewcls1();
		  Thread object = new Thread(threadobject);
		  System.out.println("Thread is about to start");
		  object.start();
	}

}
