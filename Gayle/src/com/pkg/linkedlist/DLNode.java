package com.pkg.linkedlist;

public class DLNode {
	public int data;
	public DLNode next;
	public DLNode prev;

	public DLNode(int value) {
		this.data = value;
		this.next = null;
		this.prev = null;
	}

	public DLNode(int value, DLNode nextNode, DLNode prevNode) {
		this.data = value;
		this.next = nextNode;
		this.prev = prevNode;
	}

}
