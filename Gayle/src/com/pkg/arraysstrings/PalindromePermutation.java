package com.pkg.arraysstrings;

public class PalindromePermutation {
	static String s = "tactocha";

	public static void main(String[] args) {
		int[] asci = new int[128];
		int oddcount = 0;
		for (int i = 0; i < s.length(); i++) {
			asci[s.charAt(i)]++;

			if (asci[s.charAt(i)] > 1) {
				if (asci[s.charAt(i)] % 2 == 0) {
					System.out.println("asci[s.charAt(i)]"+asci[s.charAt(i)]);
					System.out.println(s.charAt(i));
				}} else {
					if (oddcount == 0) {
						oddcount = oddcount + 1;
					} else {
						System.out.println("not permutation exit");
						break;
					}
				}
			
		}

	}

}
