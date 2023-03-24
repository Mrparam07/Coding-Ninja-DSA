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

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(head==null)
        return head;
        if(i-j==0)
        return head;
        LinkedListNode<Integer> temp=head,prev=null,c1=null,c2=null,p1=null,p2=null;
        int pos=0;
        while(temp!=null)
        {
            if(pos==i)
            {
                p1=prev;
                c1=temp;
            }
else if(pos==j)
{
    p2=prev;
    c2=temp;
}
            prev=temp;
            temp=temp.next;
            pos++;
        }
        if(p1!=null)
        {
            p1.next=c2;
        }
        else{
            head=c2;
        }
        if(p2!=null){
            p2.next=c1;
        }
        else{
            head=c1;
        }
        LinkedListNode<Integer> temp1=c2.next;
        c2.next=c1.next;
        c1.next=temp1;
        return head;
	}

}
