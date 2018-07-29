package com.pkg.linkedlist.leetcode.problems;

import java.util.LinkedList;
import java.util.Objects;

public class Sumoftwolists {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();

		l1.add(1);
		l1.add(30);
		l1.add(90);
		l1.add(120);

		l2.add(0);
		l2.add(3);
		l2.add(12);
		l2.add(32);

		int l1size = l1.size();
		int l2size = l2.size();
		int i=0 ,j=0;
		while(l1size >0 || l2size >0) {
			if( j<l2.size() &&  i <l1.size() ) {
				if(l1.get(i)>l2.get(j)) {
				result.add(l2.get(j));
				j++;
				l2size--;
			}
		}
			else if(i<l1.size() && j<l2.size() ) {
				if(l1.get(i)<l2.get(j)) {
				result.add(l1.get(i));
				i++;
				l1size--;
				}
			}
			else
			{
			l1size =0;
			l2size = 0;
			
			}
		}
		
		for(int tem:result) {
			System.out.println(tem);
		}

	}
}
