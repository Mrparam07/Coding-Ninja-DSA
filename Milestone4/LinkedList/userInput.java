import java.util.Scanner;
public class LinkListUse 
{
  public static Node<Integer> userInput()
    {
        Scanner sc=new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while(data != -1)
        {
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head==null)
            {
                head=currentNode;
            }
            else
            {
                Node<Integer> tail = head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
      public static void print(Node<Integer> head)
        {
            Node<Integer> temp = head;
            while(temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
  public static void main(String[] args) {

        Node<Integer> head2 = userInput();
        print(head2);
    }
}
