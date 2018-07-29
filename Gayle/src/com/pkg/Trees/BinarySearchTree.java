package com.pkg.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.Semaphore;

public class BinarySearchTree {

	public TreeNode root;
	Throwable t;
	Semaphore s;

	public void insert(int data) {
		TreeNode node = new TreeNode(data);

		if (root == null) {
			root = node;
			return;
		}

		TreeNode parent = null, current = root;

		while (current != null) {
			parent = current;

			if (data > current.value) {
				current = current.right;
			} else {
				current = current.left;

			}

		}
		if (parent.value <= data) {

			parent.right = node;
		} else {
			parent.left = node;
		}
		// return parent;
	}

	public void preOrder() {
		System.out.println("pre order");
		TreeNode temp = root;
		if (root == null) {
			return;
		}

		Stack<TreeNode> s = new Stack<TreeNode>();
		s.add(root);

		while (!s.isEmpty()) {
			// System.out.println(s.size());
			temp = s.pop();
			System.out.println(temp.value);

			if (temp.right != null) {
				s.push(temp.right);
			}
			if (temp.left != null) {
				s.push(temp.left);
			}

		}

	}

	public void postordertraversal() {
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();

		TreeNode temp = root;
		s1.push(temp);
		while (!s1.isEmpty()) {
			temp = s1.pop();
			s2.push(temp);

			if (temp.left != null) {
				s1.push(temp.left);
			}

			if (temp.right != null) {
				s1.push(temp.right);
			}

		}

		while (!s2.isEmpty()) {
			temp = s2.pop();
			System.out.println(temp.value);
		}

	}

	public void inorderTraversal() {
		if (root == null)
			return;

		Stack<TreeNode> s = new Stack<TreeNode>();

		TreeNode temp = root;

		while (true) {
			if (temp != null) {
				s.push(temp);
				temp = temp.left;
			} else {
				if (s.isEmpty()) {
					break;
				}
				temp = s.pop();
				System.out.println(temp.value);
				temp = temp.right;

			}
		}
	}

	public void levelTraversal() {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.println(temp.value);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}

	}

	public TreeNode removeElement(TreeNode root, int value) {
		if (root == null)
			return null;
		if (root.value > value) {
			root.left = removeElement(root.left, value);
		} else if (root.value < value) {
			root.right = removeElement(root.right, value);

		} else {
			// if nodeToBeDeleted have both children
			if (root.left != null && root.right != null) {
				TreeNode temp = root;
				// Finding minimum element from right
				TreeNode minNodeForRight = minimumElement(temp.right);
				// Replacing current node with minimum node from right subtree
				root.value = minNodeForRight.value;
				// Deleting minimum node from right now
				removeElement(root.right, minNodeForRight.value);

			}
			// if nodeToBeDeleted has only left child
			else if (root.left != null) {
				root = root.left;
			}
			// if nodeToBeDeleted has only right child
			else if (root.right != null) {
				root = root.right;
			}
			// if nodeToBeDeleted do not have child (Leaf node)
			else
				root = null;
		}
		return root;
	}

	public static TreeNode minimumElement(TreeNode tempNode) {
		if (tempNode.left == null)
			return tempNode;
		else {
			return minimumElement(tempNode.left);
		}
	}

	private TreeNode findMin(TreeNode node) {
		TreeNode temp = node, parent = null;
		if (node == null)
			return node;
		while (temp.left != null) {
			parent = temp.left;
			temp = temp.left;
		}

		return parent;
	}

	private TreeNode searchElement(int value) {
		TreeNode temp = root;
		if (temp == null)
			return temp;
		while (temp != null) {
			if (value > temp.value) {
				temp = temp.right;
			}
			if (value < temp.value) {
				temp = temp.left;
			}
			if (temp.value == value) {
				return temp;
			}
		}
		return temp.value == value ? temp : null;
	}

	public void printrightSideView(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 1; i <= n; i++) {
				TreeNode temp = q.poll();
				
				if(i == n) {
					System.out.println(temp.value);
				}
				
				if(temp.left!=null) {
					q.add(temp.left);
				}
				
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
		}
	}

	
	public void printleftSideView(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 1; i <= n; i++) {
				TreeNode temp = q.poll();
				
				if(i == n) {
					System.out.println(temp.value);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
				if(temp.left!=null) {
					q.add(temp.left);
				}
			}
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bs = new BinarySearchTree();
		bs.insert(10);
		bs.insert(5);
		bs.insert(15);
		bs.insert(20);
		bs.insert(7);
		bs.insert(13);
		bs.insert(3);
		bs.insert(17);
		bs.inorderTraversal();
		// bs.preOrder();
		// System.out.println("search" + bs.searchElement(15).left.value);
		// System.out.println("find min" + bs.findMin(bs.root.right).value);

		System.out.println("deleting");
		// bs.removeElement(bs.root,3);
		System.out.println("-----------");
		bs.inorderTraversal();
		System.out.println("level");
		bs.levelTraversal();
		System.out.println("-----------");
		bs.printrightSideView(bs.root);
		
		System.out.println("-----------");
		
		bs.printleftSideView(bs.root);

	}

}
