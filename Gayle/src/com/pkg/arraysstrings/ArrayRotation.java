package com.pkg.arraysstrings;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		int location = 0;

		if (k < arr.length) {
			for (int l = 0; l < k; l++) {
				int i, temp;
				temp = arr[0];
				for (i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[i] = temp;
			}

		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}
}
