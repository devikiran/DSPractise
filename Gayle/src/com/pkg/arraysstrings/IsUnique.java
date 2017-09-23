package com.pkg.arraysstrings;

public class IsUnique {
	/*
	 * Implement an algorithm to determine if a string has all unique
	 * characters. What if you cannot use additional data structures? Hints:
	 * #44, #7 7 7, #732
	 */

	public static void main(String[] args) {

		// System.out.println("))Tes)t".replace(")", "\\)"));

		/*
		 * String str = "(TES(T)TT))"; str=str.replaceAll("[(]", "\\(");
		 * str=str.replaceAll("[)]", "\\)"); System.out.println(str);
		 */
		/*
		 * int value=22; value=value<<1; System.out.println(value); int
		 * aByt=0b00100000;
		 * 
		 * char val='C';
		 * 
		 * 
		 * if((Integer.parseInt(Integer.toBinaryString(val)) & aByt)==0) {
		 * System.out.println("Capital letters"); } else {
		 * System.out.println("small Letter"); } }
		 */

		String s = "abcdefa";

		int[] values = new int[128];
		for(int c:values)
		{
			//System.out.println("Starting "+c);
		}
		for (int i = 0; i < s.length(); i++) {
			values[s.charAt(i)]++;
			if(values[s.charAt(i)]>1)
			{
				System.out.println("Not unique");
				System.out.println(s.charAt(i));
			}
		}
		for(int c:values)
		{ int a=c;
			char b=(char)a;
			System.out.println(b+"  value  "+a);
		}
	}

}
