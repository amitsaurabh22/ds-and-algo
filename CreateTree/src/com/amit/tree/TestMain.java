package com.amit.tree;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 5, 6, 33, 55, 77, 55, 66, 77, 79 };
		Node n = TreeUtils.arrayToTree(arr);
		System.out.print("pre order");
		preOrder(n);
		System.out.print("\nin order");
		inOrder(n);
		System.out.print("\npost order");
		postOrder(n);
	}



	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(" " + root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(Node root) {
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(" " + root.data);
		inOrder(root.right);
	}

	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(" " + root.data);
	}

}
