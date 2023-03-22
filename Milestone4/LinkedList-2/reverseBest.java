


public static Node<Integer> reverseBest(Node<Integer> head)
{
  if(head==null || head.next==null)
    return head;
  
  Node<Integer> smallHead = reverseBest(head.next);
  Node<Integer> reverseTail = head.next;
  
  reverseTail.next = head;
  head.next = null;
  return smallHead;
}
