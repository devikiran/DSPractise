package com.pkg.Trees;

public class TreeNode {
	int value;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int data) {
		this.value = data;
		this.left = null;
		this.right = null;
	}

	public TreeNode(int data, TreeNode r, TreeNode l) {
		this.value = data;
		this.right = r;
		this.left = l;
	}

}
