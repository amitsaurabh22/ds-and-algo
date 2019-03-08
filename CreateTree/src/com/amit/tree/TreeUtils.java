package com.amit.tree;

import java.util.LinkedList;

public class TreeUtils {

	public static Node arrayToTree(int[] arr) {
		int index = 0;
		if (arr == null || arr.length == 0) {
			return null;
		}
		Node root = new Node(arr[index++]);
		LinkedList<Node> list = new LinkedList<Node>();
		list.add(root);

		while (!list.isEmpty() && index < arr.length) {
			Node n = list.removeFirst();
			n.left = new Node(arr[index++]);
			list.add(n.left);
			if (index < arr.length) {
				n.right = new Node(arr[index++]);
				list.add(n.right);
			}
		}

		return root;
	}

	public void printTree(Node root) {
		if (root==null) {return ;}
		LinkedList<Node> list = new LinkedList<Node>();
		list.add(root);
		
		while (!list.isEmpty()) {
			Node n = list.removeFirst();
			System.out.print(" " + n.data);
			if (n != null) {
				list.add(n.left);
				list.add(n.right);
			}
		}

	}

}
