package cm.pkg.commonproblems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Swapping {
	public static void main(String[] args) {
		int a =3;
		int b =4;
		
		System.out.println(a +"before"+ b);
		swap(a, b);
		System.out.println(a + "afdter" + b);
		
		ExecutorService e = Executors.newCachedThreadPool();
	}
	
	static void swap(int c,int d) {
		int temp =c;
		c = d;
		d= temp;
	}
}
