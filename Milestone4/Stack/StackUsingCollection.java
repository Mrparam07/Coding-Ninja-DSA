import java.util.Stack;
public class StackUsingCollection {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        int arr[]={1,2,3,4,5};
        for(int elem: arr)
        {
            stack.push(elem);
        }
        while(!stack.isEmpty())
        {
            stack.pop();
        }
        System.out.println(stack.isEmpty());
    }
}
