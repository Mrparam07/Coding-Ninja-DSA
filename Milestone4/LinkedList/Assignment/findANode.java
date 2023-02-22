/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
		if(head == null)
		return -1;
		LinkedListNode<Integer> temp = head;
		int count=0;
	
		while(temp!=null)
		{
			if(temp.data==n)
			return count;
			else
			{
				temp=temp.next;
				count++;
			}
		}
		
		return -1;
	}
}
