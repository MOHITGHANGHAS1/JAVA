package Multi_Threading;
import java.util.*;

class Threadrunnanblenewcls implements Runnable {
	public void run() {
		try {
			//displaying the thread id runnable
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e){
			//throwing an exception
			
			System.out.println("Exception is caught");
		}
	}
}
public class Multi_Threading1{
	public static void main(String[] args) {
		int n =8;//number of threads
		for( int i = 0;i<n;i++) {
			  Thread object = new Thread(new Threadrunnanblenewcls());
	            object.start();

		}

	}

}