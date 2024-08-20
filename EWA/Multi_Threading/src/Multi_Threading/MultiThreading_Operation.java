package Multi_Threading;

class MultiThreading extends Thread{
	private int number;

	// create constructor
	MultiThreading(int number){
		this.number= number;
	}
	public void run() {
		int counter = 0;
		int num = 0;
		do {
			num = (counter+10);
			System.out.println(this.getName()+" prints "+num);
			counter++;
		}
		while(num!=number);
		System.out.println("correct"+this.getName()+" printed "+counter+" times");
	}
}

public class MultiThreading_Operation {

	public static void main(String[] args) {
		System.out.println("Starting Thread 1...");
		//Created a thread class instance
		Thread t1= new MultiThreading(15);
		t1.start();

	}

}
