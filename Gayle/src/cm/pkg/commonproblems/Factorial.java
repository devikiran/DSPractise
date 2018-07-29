package cm.pkg.commonproblems;

public class Factorial {

	public int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int result = f.factorial(4);
		System.out.println(result);
	}
}
