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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
		if(head == null)
		return head;
		if(n==0)
		return head;
		LinkedListNode<Integer> temp = head;
		int length=0;
		while(temp!=null)
		{
			temp = temp.next;
			length++;
		}
		int appendLen = length-n;
		int count=0;
		LinkedListNode<Integer> tempOne = head;

		while(count<appendLen-1)
		{
			tempOne = tempOne.next;
			count++;
		}
		LinkedListNode<Integer> tempTwo = tempOne.next;
		LinkedListNode<Integer> tempThree = tempOne.next;
		while(tempTwo.next!=null)
		{
			tempTwo=tempTwo.next;
		}
		tempTwo.next=head;
		tempOne.next=null;
		return tempThree;
	}

}
