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


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        if(head==null)
        return -1;
        if(head.data == n)
        return 0;
        int index = findNodeRec(head.next, n);
        if(index == -1)
        return index;
        else
        return index+1;
	}

}
