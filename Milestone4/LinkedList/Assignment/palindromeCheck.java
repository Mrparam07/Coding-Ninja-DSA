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

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head == null || head.next==null)
		return true;
		int length=0;
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> tempArr=head;
		while(temp!=null)
		{
			temp=temp.next;
			length++;
		}
		int arr[] = new int[length];
		int k=0;
		while(tempArr!=null)
		{
			arr[k]=tempArr.data;
			tempArr=tempArr.next;
			k++;
			
		}
		int arr2[]= new int[length];
		int j=0;
		int x=length;
		for(int i=0;i<length;i++)
		{
			arr2[x-1]=arr[i];
			
			x--;
		}
	
		for(int i=0;i<length;i++)
		{
			if(arr[i]!=arr2[i])
			return false;
		}
		return true;
	}

}
