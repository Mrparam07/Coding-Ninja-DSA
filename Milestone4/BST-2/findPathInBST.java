import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
		 if(root==null)
            return null;
        if(root.data==data)
        {
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }
        if(data<root.data)
        {
            ArrayList<Integer> output=getPath(root.left,data);

            if(output!=null)
            {
                output.add(root.data);
                return output;
            }
        }
        ArrayList<Integer> output2;
        if(data>root.data)
        {
            output2=getPath(root.right,data);

            if(output2!=null){
                output2.add(root.data);
                return output2;
			}
		}

        
            return null;

	}
}
