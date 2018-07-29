package cm.pkg.commonproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Myrunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("1");
	}
	public static void main(String[] args) throws InterruptedException {
		ExecutorService e = Executors.newSingleThreadExecutor();
		
		List<Runnable> l = new ArrayList();
		l.add(new Myrunnable());
		l.add(new MyRunnable2());
		l.add(new MyRunnable3());
		
		for(Runnable a:l) {
			e.submit(a);
		}
		
	}
	
	
	/*void go(long id) {
		System.out.println(id);
	}
	
	public static  void main(String[] args)  throws InterruptedException{
		System.out.println(Thread.currentThread().getId());
		new Myrunnable().run();
	}

	
	public void run() {
		go(Thread.currentThread().getId());
	}
}



class WaitTest{*/
	/*public static void main(String[] args) {
		System.out.println("1");
		synchronized (args) {
			System.out.println("2");
			try {
				args.wait();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("3");
		}
	}*/
	
	/*public static void main(String[] args) {
		Myrunnable t = new Myrunnable();
		Thread tt= new Thread(t);
		tt.start();
	}
		public void run(){
			for(int i =0;i<3; ++i) {
				System.out.println(i+"...");
			}
		}*/
}