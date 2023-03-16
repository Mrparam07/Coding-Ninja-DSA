
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
    private Node head;
    private int size;
    

    public Stack() {
        //Implement the Constructor
        head=null;
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
       Node newNode=new Node(element);
       if(head==null){
           head=newNode;
       }
       else{
               newNode.next=head;
               head=newNode;
       }
    
       size++;
    }

    public int pop()  {
        //Implement the pop() function
         if(head==null){
            size=0;
            return -1;
        }
        else{
            size--;
            int topElement = head.data;
            head = head.next;
            return topElement;
        }
     
    }

    public int top() {
        //Implement the top() function
         if(head==null){
            return -1;
        }
        else{
            return head.data;
        }
    
    }
}
