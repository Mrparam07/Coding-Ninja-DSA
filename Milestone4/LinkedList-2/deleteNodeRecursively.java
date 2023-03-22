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


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head==null && pos>0)
        return head;

        if(pos==0){
            if(head==null)
            return head;
            else
            return head.next;
        }
        else{
            LinkedListNode<Integer> smallerHead = deleteNodeRec(head.next, pos-1);
            head.next=smallerHead;
            return head;
        }
	}

}
