
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	int temp;
        int n=arr.length;
        for(int i=0;i<n-1;i=i+2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
       
    }
}
