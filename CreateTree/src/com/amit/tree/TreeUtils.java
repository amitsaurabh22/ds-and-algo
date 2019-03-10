package com.amit.tree;

import java.util.LinkedList;

public class TreeUtils {

	public static TNode arrayToTree(int[] arr) {
		int index = 0;
		if (arr == null || arr.length == 0) {
			return null;
		}
		//get element from the array and convert into Tree Node
		TNode root = new TNode(arr[index++]);
		//create a linked list and Tree Node into it
		LinkedList<TNode> list = new LinkedList<TNode>();
		list.add(root);

		while (!list.isEmpty() && index < arr.length) {
			TNode n = list.removeFirst();
			n.left = new TNode(arr[index++]);
			list.add(n.left);
			if (index < arr.length) {
				n.right = new TNode(arr[index++]);
				list.add(n.right);
			}
		}

		return root;
	}

	public static  void printTree(TNode root) {
		if (root==null) {return ;}
		LinkedList<TNode> list = new LinkedList<TNode>();
		list.add(root);
		int changeLine=1;
		int count=0;
		while (!list.isEmpty()) {
			TNode n = list.removeFirst();
			if (n != null) {
				count++;
				System.out.print(" " + n.data);
				if(count == changeLine){
					System.out.println();
					changeLine = (changeLine+1) *2-1;
				}
				list.add(n.left);
				list.add(n.right);
			}
		}

	}

}
