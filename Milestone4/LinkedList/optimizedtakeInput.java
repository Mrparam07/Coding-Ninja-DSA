public class Node<T> {
    Node<T> next;
    T data;
    Node(T data)
    {
        this.data=data;
        next=null;
    }
}

------------------------------------------------------------------------

import java.util.Scanner;
public class LinkListUse {
   public static void print(Node<Integer> head)
    {
        Node<Integer> temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node<Integer> optimizedTakeInput()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null , tail = null;
        while(data!=-1)
        {
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head==null){
                head = currentNode;
                tail = currentNode;
            }
            else {
                tail.next=currentNode;
                tail=currentNode; // tail=tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
  public static void main(String[] args) {

        Node<Integer> head = optimizedTakeInput();
        print(head);
    }
}
