package com.Tree;

public class BinarySearchTree {
Node root;
static boolean del = false;
	public BinarySearchTree() {
		root=null;
	}
	public void add(Node start,Node newNode) {
		if(root == null) {
			root=newNode;
		}
		else {
			if(newNode.value>start.value) {
				if(start.right == null)
					start.right=newNode;
				else
				add(start.right,newNode);
			}
			if(newNode.value<start.value) {
				if(start.left == null)
					start.left=newNode;
				else
				add(start.left,newNode);
			}
		}
	}
	public void search(int value,Node start) {
		if(start == null) {
			System.out.println("No Node Found");
			return;
		}
		if(value == start.value) {
			System.out.println("Node is found");
			return;
		}
		if(value>start.value) {
			search(value,start.right);
		}
		if(value<start.value) {
			search(value,start.left);
		}

	}
	public void displayTree(Node start) {
		if(start != null) {
			System.out.println(start.value+",");
			displayTree(start.left);
			displayTree(start.right);
		}
	}
	public void deleteTree(Node start,int value) {
		if(start != null) {
			if(start.left != null && start.left.value == value) {
				if(start.left.left == null && start.left.right == null) {
					start.left=null;
				}
				if(start.left.left == null && start.left.right != null) {
					Node delnode=start.left;
					start.left=start.left.right;
					delnode.right=null;
				}
				if(start.left.left != null && start.left.right == null) {
					Node delnode=start.right;
					start.left=start.left.left;
					delnode.left=null;
				}
				if(start.left.left != null && start.left.right != null) {
					Node node=start.left;
					start.left=start.left.left;
					start.left.right=node.right;
					node.left=null;
					node.right=null;
				}
			}

			if(start.right != null && start.right.value == value) {
				if(start.right.left == null && start.right.right == null) {
					start.right=null;
				}
				if(start.right == null && start.right.right != null) {
					Node delnode=start.right;
					start.right=start.right.right;
					delnode.right=null;
				}
				if(start.right.left != null && start.right.right == null) {
					Node delnode=start.right;
					start.right=start.right.left;
					delnode.right=null;
				}
				if(start.right.left != null && start.left.right != null) {
					Node node=start.left;
					start.left=start.left.left;
					start.left.right=node.right;
					node.left=null;
					node.right=null;
				}
			}
		
		}
	}
	public static void main(String str[]) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(bst.root, new Node(10,null,null));
		bst.add(bst.root, new Node(12,null,null));
		bst.add(bst.root, new Node(11,null,null));
		bst.add(bst.root, new Node(13,null,null));
		bst.add(bst.root, new Node(6,null,null));
		bst.search(6, bst.root);
		bst.displayTree(bst.root);
	}
}
