package com.pkg.linkedlist.problems;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Find the nth node from the end of the given linked list.
 * 
 * Given a linked list and a integer n ,you should find the 
 * nth value in the linked list from end.
 */

public class FindNthNodeFromEnd {
Object ii;
	public Integer findNtheNode(int n, LinkedList<Integer> plist) {
		Iterator slowIterator = plist.iterator();
		Iterator fastIterator = plist.iterator();
		int count = 0;
		int result = 0;
		while (fastIterator.hasNext()) {
			fastIterator.next();

			if (count == n) {
				result = (int) slowIterator.next();
				System.out.println(result);
			} else {

				count++;
			}
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
		FindNthNodeFromEnd sol = new FindNthNodeFromEnd();
		System.out.println(" solution result " + sol.findNtheNode(3, list));

	}

}
