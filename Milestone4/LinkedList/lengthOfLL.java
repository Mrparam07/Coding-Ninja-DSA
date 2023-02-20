public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
}
