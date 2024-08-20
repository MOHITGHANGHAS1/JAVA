package Multi_Threading;
class ThreadDemo extends Thread
{
private Thread t;
private String threadname;

ThreadDemo(String name){
	threadname = name;
	System.out.println("Creating "+threadname);
}
public void run() {
	System.out.println("Running "+threadname);
try {
	for(int i=4;i>0;i--){
		System.out.println("thread "+threadname+","+i);
		Thread.sleep(5000);
	}
}
catch(InterruptedException e){
	System.out.println("thread "+threadname+" Interrupted");
}

System.out.println("thread "+threadname+" exiting");


}

}
public class MultiThreading_Sleep {

	public static void main(String[] args) {
		ThreadDemo T1 = new ThreadDemo("Thread-1 ");
        T1.start();
        System.out.println("thread t1 is alive "+ T1.isAlive());
        ThreadDemo T2 = new ThreadDemo("Thread-2 ");
        T2.start();
        System.out.println("thread t2 is alive "+ T2.isAlive());
        
        
	}

}
