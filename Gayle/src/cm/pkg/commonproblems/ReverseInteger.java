package cm.pkg.commonproblems;

public class ReverseInteger {
public static void main(String[] args) {
	int val = 1678;
	int reverse = 0;
	
	while(val != 0) {
		reverse = reverse * 10;
		int temp = val%10;
		reverse = reverse + temp;
		val = val/10;
	}
	
	System.out.println(reverse);
}
}
