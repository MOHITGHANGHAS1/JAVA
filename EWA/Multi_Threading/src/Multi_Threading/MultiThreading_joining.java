package Multi_Threading;

 class MyThread extends Thread{
	public void run() {
		System.out.println("r1");
		try {
			Thread.sleep(500);
			
		}catch(InterruptedException e){
			
		}System.out.println("r2");
	}
}
	
	public class MultiThreading_joining{

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		System.out.println("t1 is alive "+t1.isAlive());
		System.out.println("t2 is alive "+t2.isAlive());
		try {
			t1.join();
			System.out.println("t1 is alive "+t1.isAlive());
			
			//waiting for t1 to finish
		}catch(InterruptedException e) {
			
		}
		t2.start();
		System.out.println("t2 is alive "+t2.isAlive());
		
	}

}
