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

	public static void printPostOrder(TreeNode<Integer> root){

		
		for(TreeNode<Integer> child : root.children)
		{
			printPostOrder(child);
			//System.out.print(root.data+" ");
			
		}
		System.out.print(root.data+" ");
	}

}
