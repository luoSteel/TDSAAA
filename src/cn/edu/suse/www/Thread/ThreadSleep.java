package cn.edu.suse.www.Thread;

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Processorr();
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"--------->"+i);
			Thread.sleep(1000);
		}
	}

}
class Processorr extends Thread {
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"--------->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}