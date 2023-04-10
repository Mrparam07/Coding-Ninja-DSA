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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		
	 if (root == null) {
        return;
    }

		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();

			for (int i = 0; i < levelSize; i++) {
				TreeNode<Integer> current = queue.poll();
				System.out.print(current.data + " ");

				for (TreeNode<Integer> child : current.children) {
					queue.offer(child);
				}
			}

			System.out.println();
		}

		
	
	}
		
}
