public class StackUsingArray {
    private int data[];
    private int topIndex=-1;

    StackUsingArray()
    {
        data=new int[2];
    }
    public int size()
    {
        return topIndex+1;
    }
    public boolean isEmpty()
    {
//        if(topIndex==-1)
//            return true;
//        else
//            return false;
        return topIndex==-1;
    }
    public void push(int elem) throws StackFullException
    {
//        if(data.length==size()-1)
//            System.out.println("you are out of space");
//        else {
//            topIndex++;
//            data[topIndex] = elem;
//        }
//        if(data.length==size()-1){
//            StackFullException e=new StackFullException();
//            throw e;
//        }

        //DOUBLE CAPACITY

        if(topIndex== data.length-1){
            doubleCapacity();
        }
        data[++topIndex]=elem;
    }
    private void doubleCapacity()
    {
        System.out.println("size * 2");
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=1;i<temp.length;i++)
        {
            data[i]=temp[i];
        }
    }
    public int top() throws StackEmptyException
    {
//        try{
//            return data[topIndex+1];
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        return -1;
        if(topIndex==-1){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        return data[topIndex+1];
    }
    public int pop() throws StackEmptyException
    {
//        if(topIndex==-1) {
//            System.out.println("Underflow");
//            return -1;
//        }
//        else {
//            int temp = data[topIndex];
//            topIndex--;
//            return temp;
//        }
        if(topIndex==-1) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}
class StackFullException extends Exception{

}
class StackEmptyException extends Exception{

}
class StackUse{
    public static void main(String[] args) throws StackEmptyException,StackFullException{
        StackUsingArray stack=new StackUsingArray();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        System.out.println("Size::"+stack.size());
    }
}
