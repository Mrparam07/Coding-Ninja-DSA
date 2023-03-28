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

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if (root==null)
        {
            return 0;
        }
        return findHeight(root.left)+findHeight(root.right)+1;
	}
    
    public static int findHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        
        if(leftHeight>rightHeight)
        {
            return leftHeight+1;
        }
        else
        {
            return rightHeight+1;
        }
    }
	
}
