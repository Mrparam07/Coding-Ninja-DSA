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

// public class Solution {

// 	public static boolean isBST(BinaryTreeNode<Integer> root) {

// 		if(root==null)
//              return true;
//           if(root.left!=null && root.right!=null){
// 			if(root.data<=root.left.data || root.data>=root.right.data)
//               return false;
// 		  }
//             // if(root.data>root.left.data && root.data<=root.right.data)
//             //   return true;
                
//      //   }
//             boolean ans1=isBST(root.left);
//             boolean ans2=isBST(root.right);
//             return (ans1&& ans2);
// 	}

// }
public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
         if(root==null)
                return true;
            int max=maximum(root.left);
            int min=minimum(root.right);
            if(root.data<=max || root.data>min)
                return false;

            boolean ans1=isBST(root.left);
            boolean ans2=isBST(root.right);
            return(ans1&& ans2);

        }
        public static int maximum(BinaryTreeNode<Integer> root)
        {
            if(root==null)
                return Integer.MIN_VALUE;
            return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));


            }
        public static int minimum(BinaryTreeNode<Integer> root)
        {
            if(root==null)
                return Integer.MAX_VALUE;
            return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
        }

    }
