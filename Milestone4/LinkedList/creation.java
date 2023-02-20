public class Node<T> {
    Node<T> next;
    T data;
    Node(T data)
    {
        this.data=data;
        next=null;
    }
}
//---------------------------------------------------------------------------------//

public class LinkListUse {
    public static Node<Integer> createLinkList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("n1 "+ n1 +" data=" +n1.data+" nextnode " +n1.next);
        System.out.println("n2 "+ n2 +" data=" +n2.data+" nextnode " +n2.next);
        System.out.println("n3 "+ n3 +" data=" +n3.data+" nextnode " +n3.next);
        System.out.println("n4 "+ n4 +" data=" +n4.data+" nextnode " +n4.next);
        return n1;

    }
    public static void print(Node<Integer> head)
    {
        while(head!=null) {
            System.out.println(head.data+" node address "+head);
            head = head.next;
        }
    }
    public static void main(String[] args) {

        Node<Integer> head = createLinkList();
        print(head);
    }
}
//---------------------------------------------------------------------------------//
/*output

n1 Node@4e50df2e data=10 nextnode Node@1d81eb93
n2 Node@1d81eb93 data=20 nextnode Node@7291c18f
n3 Node@7291c18f data=30 nextnode Node@34a245ab
n4 Node@34a245ab data=40 nextnode null
10 node address Node@4e50df2e
20 node address Node@1d81eb93
30 node address Node@7291c18f
40 node address Node@34a245ab
*/
