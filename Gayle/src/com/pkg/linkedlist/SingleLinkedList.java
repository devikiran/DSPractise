package com.pkg.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SingleLinkedList implements List<Integer> {
	Node head;
	int size;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Integer e) {
		Node newNode = new Node(e);
		Node temp = head;
		if (head == null) {
			head = newNode;
			return true;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		size = size + 1;

		return temp.next != null;
	}

	@Override
	public boolean remove(Object o) {
		Node temp=head;
		while(temp.next!=null) {
			//temp=temp.next;
			if(temp.next.value == (int) o) {
				temp.next=temp.next.next;
			
			}
			else
			{
				temp=temp.next;
			}
		}
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer get(int index) {
		Node temp = head;
		int counter = 0;
		if (index < this.size()) {
			System.out.println("index passed is lesser than the size of the list");
			return -1;
		}
		if (this.head != null) {
			while (temp.next != null && counter <= index) {
				if (counter == index) {
					return temp.value;
				} else {
					temp = temp.next;
					counter = counter + 1;
				}

			}
		} else {
			System.out.println("no elements available in the linked list");
		}
		return null;
	}

	@Override
	public Integer set(int index, Integer element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Integer element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Integer> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public void printall() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
	}

	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public Node reverseInBlocks(Node head, int k) {

		Node current = head;
		Node next = null;
		Node prev = null;
		int count = 0;
		/* Reverse first k nodes of linked list */
		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		/*
		 * next is now a pointer to (k+1)th node Recursively call for the list starting
		 * from current. And make rest of the list as next of first node
		 */
		if (next != null)
			head.next = reverseInBlocks(next, k);
		// prev is now head of input list
		return prev;

	}

	public static void main(String[] args) {
		SingleLinkedList s = new SingleLinkedList();
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(17);
		s.add(18);
		s.add(19);
		s.add(20);

		s.printall();
		s.reverseInBlocks(s.head, 3);
		
		//s.remove(new Integer(17));
		
		System.out.println("----------------");
		
		s.printall();
	}
}