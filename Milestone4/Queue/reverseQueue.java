import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		// Queue<Integer> temp = new LinkedList<Integer>();
		// while(!input.isEmpty())
		// {
		// 	temp.add(input.remove());
		// }
		// while(!temp.isEmpty())
		// {
		// 	System.out.print(temp.remove()+" ");
		// }
		if(input.size()==0 || input.size()==1)
		return;

		int temp=input.remove();
		reverseQueue(input);
		input.add(temp);
	}

}
