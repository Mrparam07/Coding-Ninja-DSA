import java.lang.*;
public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static int getHeight(TreeNode<Integer> root){
		
		int ht = 0;
		for(TreeNode<Integer> child : root.children)
		{
			ht = Math.max(ht, getHeight(child));
		}
		return ht+1;
	}

}
