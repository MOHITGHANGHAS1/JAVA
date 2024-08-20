package Multi_Threading;


	class Threadrunnanblenewcls2 extends Thread {
		public void run() {
			System.out.println("Thread is under running");
			for( int i = 0;i<=10;i++) {
				System.out.println("i = "+i);
			}
		}
	}
	public class Multi_Threading3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Threadrunnanblenewcls2 t1 = new Threadrunnanblenewcls2();
		  
		  System.out.println("Thread is about to start");
		  t1.start();
	}

}
