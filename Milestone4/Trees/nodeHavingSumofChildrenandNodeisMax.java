import java.util.*;
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
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here
        return maxSumNode(root, 0);
    }
    
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root, int maxSum){
    
    if(root.children.size() == 0){
        return null;
        
    }
    
    TreeNode<Integer> maxNode = null;
    int tempSum = root.data;
    for(int i = 0 ; i < root.children.size() ; ++i){
        tempSum += root.children.get(i).data;
    }
    if(tempSum > maxSum){
        maxSum = tempSum;
        maxNode = root;
        
    }
    //System.out.println("MaxNum now for "+root.data+" is: "+ maxSum);
    
    for(int i = 0 ; i < root.children.size() ; ++i){
        TreeNode<Integer> temp = maxSumNode(root.children.get(i), maxSum);
        if(temp == null){
            continue;
        }
        if(temp != null){
            maxNode = temp;
        }
    }
    return maxNode;
}
}
