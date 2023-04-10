
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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		 if(root==null)
	  {return null;}
	  
        TreeNode<Integer> ans=null;
        if(root.data>n) {
            ans=root;
        }
        for(TreeNode<Integer> child : root.children) {
            TreeNode<Integer> childans=findNextLargerNode(child,n);
            if(childans!=null) {
                if(ans==null || ans.data>childans.data) {
                    ans=childans;
                }
            }
        }
        return ans;

	}
	
}
