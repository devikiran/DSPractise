package com.pkg.linkedlist;

public class DoubleLinkedList {

	DLNode head;

	// adding at end of the dlinkedlist
	public boolean add(Integer value) {
		DLNode temp = head;
		DLNode node = new DLNode(value);
		if (temp == null) {
			head = node;
			return true;
		}

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp.next;
		return true;

	}
	
	public void addAtBegin(Integer value) {
		DLNode node=new DLNode(value);
		DLNode temp=head;
		node.next=temp;
		temp.prev=node.next;
		head =node;
		
	}
	
	public void removeEle(Integer value) {
		DLNode temp=head;
		if(temp == null) {
			return;
		}
		if(temp.data == value) {
			head=null;
		}
		while(temp.next !=null) {
			
			if(temp.next.data == value) {
				temp.next=temp.next.next;
				temp.next.prev=temp.next.next.prev;
			}
			else
			{
				temp=temp.next;
			}
		}
		
	}

	public void printall() {
		DLNode temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	

	public static void main(String[] args) {
		DoubleLinkedList s = new DoubleLinkedList();
		
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(17);
		s.add(18);
		s.add(19);
		s.add(20);
		s.addAtBegin(1122);
		s.printall();
		System.out.println("-----------");
		s.removeEle(13);
		s.printall();

	}
}
