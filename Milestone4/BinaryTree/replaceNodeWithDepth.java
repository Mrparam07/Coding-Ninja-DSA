/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	  
	  fun(root,0);
	}
	public static void fun(BinaryTreeNode<Integer> root, int depth)
	{
		if(root == null)
		return;

		root.data = depth;
		fun(root.left, depth+1);
		fun(root.right, depth+1);
	}

}
