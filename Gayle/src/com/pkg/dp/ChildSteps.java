package com.pkg.dp;

import java.util.Arrays;

public class ChildSteps {
	public int countways(int n) {
		int memo[] = new int[n + 1];
		Arrays.fill(memo, -1);
		return countways(n, memo);
		
	}

	private int countways(int n, int[] memo) {
		if(n<0)
			return 0;
		else if (n == 0)
			return 1;
		else if(memo[n]> -1)
			return memo[n];
		else
			{
			memo[n]=countways(n-1,memo)+countways(n-2, memo)+countways(n-3, memo);
			return memo[n];
			}
	}

	public static void main(String[] args) {

		ChildSteps c=new ChildSteps();
		System.out.println(" number of possible ways "+c.countways(4));
		
	}
}
