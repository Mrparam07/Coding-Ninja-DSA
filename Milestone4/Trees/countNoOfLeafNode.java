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
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		if(root == null)
		return 0;
		else if(root.children.isEmpty())
		return 1;
		else{
			int count = 0;
			for(TreeNode<Integer> child : root.children)
			{
				count+=countLeafNodes(child);
			}
			return count;
		}
		

	}
	
}
