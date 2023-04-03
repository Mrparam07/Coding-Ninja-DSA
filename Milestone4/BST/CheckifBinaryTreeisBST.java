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

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if(root==null)
             return true;
          if(root.left!=null && root.right!=null){
			if(root.data<=root.left.data || root.data>=root.right.data)
              return false;
		  }
            // if(root.data>root.left.data && root.data<=root.right.data)
            //   return true;
                
     //   }
            boolean ans1=isBST(root.left);
            boolean ans2=isBST(root.right);
            return (ans1&& ans2);
	}

}
