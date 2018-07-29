package cm.pkg.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] val = { 2, 1, 3, 1, 2 };
		
		int count = val.length;
		int shiftcount = 0;
		
		for(int i=1;i<count;++i) {
			int key = val[i];
			int j = i-1;
			
			while(j>=0 && val[j] > key) {
				val[j+1]=val[j];
				shiftcount ++;
				j= j-1;
			}
			val[j+1] = key;
		}
		
		for(int a:val) {
			System.out.println(a);
		}
		System.out.println("shift count"+shiftcount);
		
	}
}
