/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head==null)
		return head;
		if(head.next==null)
		return head;
		LinkedListNode<Integer> t1=head,t2=head.next;
		LinkedListNode<Integer> result=head;

		while(t2!=null)
		{
			if(t1.data.equals(t2.data))
			{
				t2=t2.next;
			}
			else
			{
				t1.next=t2;
				t1=t2;
			}
			
		}
		t1.next = null;
		return result;
	}

}
