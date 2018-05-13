package com.pkg.linkedlist.problems;

import java.util.Iterator;
import java.util.LinkedList;

public class MiddleOfGivenLinkedList {

	public Integer findMidlleElement(LinkedList<Integer> plist) {
		
		Iterator slowIterator = plist.iterator();
		Iterator fastIterator = plist.iterator();
		int count = 0;
		int result = 0;
		while (fastIterator.hasNext()) {
			fastIterator.next();
			fastIterator.next();
			result = (int) slowIterator.next();

		}

		return result;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		list.add(107);
		
		MiddleOfGivenLinkedList sol = new MiddleOfGivenLinkedList();
		System.out.println(sol.findMidlleElement(list));
	
	
	}
	
}
