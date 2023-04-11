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
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
         int leaf = 0;
        
    if (root == null )
    {
    return 0;
    }
        
        
    if (root.children.size() == 0)
    {
    return 1;
    }
        

        
   for (TreeNode<Integer> child : root.children) 
   {
    leaf += countLeafNodes(child);
  	}
        
   return leaf ;
        
           
	}
    
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        
        int a=countLeafNodes(root1),b=countLeafNodes(root2);
        
        return a==b;
	}
	
}
