
/*

Collection of Queue is differ than stack and linkedlist beacause queue is an interface rather class.

*/
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueUsingCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
