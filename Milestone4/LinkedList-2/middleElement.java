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
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
      
      /************************************************ USING COUNT *********************************************************************/
      
      
    //     int count=0;
    //     LinkedListNode<Integer> temp = head;
    //    // int arr[]=new int[100];
    //     while(temp!=null){
    //         ++count;
    //         temp=temp.next;
    //     }
    //     LinkedListNode<Integer> result = head;
    //     LinkedListNode<Integer> res= head;

    //     for(int i=0;i<count/2;i++)
    //     {
    //         res=result;
    //         result=result.next;
            
    //     }
               
    //     return res;
      
      /************************************************ USING SLOW AND FAST *********************************************************************/
    if(head==null || head.next==null)
    return head;
    LinkedListNode<Integer> slow = head;
    LinkedListNode<Integer> fast = head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     return slow;
    }

}
