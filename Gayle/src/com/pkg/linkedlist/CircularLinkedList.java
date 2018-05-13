package com.pkg.linkedlist;

public class CircularLinkedList {
	Node tail;
	
	public void insert(int value) {
	//	Node temp=tail;
		Node newNode= new Node(value);
	
		if(tail == null) {
			tail=newNode;
			tail.next=tail;
			
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}
	
	public void printAllvalues() {
		Node temp = tail;
	//	System.out.println(temp.value);
	//	System.out.println(temp.next.value);
		while(temp.next != tail) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
	}
	
	public static void main(String[] args) {
		CircularLinkedList c= new CircularLinkedList();
		c.insert(10);
		c.insert(12);
		c.insert(13);
		c.insert(14);
		c.insert(15);
		c.printAllvalues();
	
	}

}
