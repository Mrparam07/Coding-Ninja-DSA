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

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
		LinkedListNode<Integer> prev = head;
		int count=0;
		if(pos==0)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			
			while(count<pos-1 && prev!=null)
			{
				count++;
				prev=prev.next;
			}
			if(prev!=null){
			newNode.next=prev.next;
			prev.next=newNode;
			}
		}
		return head;
	}
}
