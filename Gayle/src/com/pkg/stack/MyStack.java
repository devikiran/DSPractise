package com.pkg.stack;

public class MyStack {

	int[] arr;
	int currentSize = 0;
	int minele;
	
	
	public MyStack(int size) {
		arr = new int[size];
	}

	public boolean push(int value) {
		if (currentSize <= arr.length) {
			arr[currentSize] = value;
			currentSize++;
			return true;
		} else {
			return false;
		}
	}

	public void pop() {
		if (currentSize > 0) {
			currentSize--;
		} else {
			System.out.println("stack is empty");
		}

	}

	public void printElements() {
		for (int temp = 0; temp <= currentSize - 1; temp++) {
			System.out.println(arr[temp]);
		}
	}

	public static void main(String[] args) {
		MyStack s = new MyStack(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.printElements();

		s.pop();
		s.pop();
		s.printElements();

	}
}
