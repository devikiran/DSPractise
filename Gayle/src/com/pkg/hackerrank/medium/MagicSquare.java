package com.pkg.hackerrank.medium;

/*
 * We define a magic square to be an n*n  matrix of distinct positive integers from  
 * to  where the sum of any row, column, or diagonal of length 
 *  n is always equal to the same number: the magic constant.
 */
public class MagicSquare {

	public static void main(String[] args) {
		int sum = 0;
		/*int abc[][]= {
			 {5,3,4},
			 {1,5,8},
			 {6,4,2} 
			 };*/
		
		int abc[][]= {
				{4,8,2},
				{4,5,7},
				{6,1,6}
		};
		for(int i=0;i<abc.length;i++) {
			int rowsum = 0;
			for(int j =0;j<abc.length;j++) {
				rowsum=rowsum + abc[i][j];
			}
			sum = sum + Math.abs(15-rowsum);
			System.out.println("sum"+sum);
			System.out.println("rowsum"+rowsum);
		}
		
		System.out.println(Math.abs(sum));
		
	}
}
