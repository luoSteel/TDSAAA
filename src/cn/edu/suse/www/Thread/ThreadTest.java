package cn.edu.suse.www.Thread;

public class ThreadTest {

	public static void main(String[] args) {
		//创建线程
		Thread t = new  processor();
		t.setName("线程：");
		System.out.println(t.getName()+" "+t.getId());
		
		Thread t2 = new Thread(new processors());
		System.out.println(t2.getName());
		System.out.println(Thread.currentThread().getName());
		//启动线程
		t.start();//JVM会在分配一个新的栈给t线程
		t2.start();
		
		for(int i=0;i<=10;i++){
			System.out.println("main-->"+i);
		}
		
	}

}
class processor extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("run--------->"+i);
		}
	}
}

class processors implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("run2---------------------->"+i);
		}
	}
}