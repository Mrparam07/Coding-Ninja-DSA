public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
		
		if(root.data == x)
		return true;

		for(TreeNode<Integer> child : root.children)
		{
			boolean fic = checkIfContainsX(child, x);
			if(fic)
			return true;	
		}
	return false;
	}
	
}
