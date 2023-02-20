public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
		LinkedListNode<Integer> temp = head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
			if(count==i)
			{
				System.out.print(temp.data);
				break;
			}
		}
	}
}
