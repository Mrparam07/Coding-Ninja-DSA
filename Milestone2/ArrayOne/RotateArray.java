
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int a[]=new int[arr.length];
        int j=0;
        for(int i=d;i<arr.length;i++)
        {
            a[j]=arr[i];
            j++;
        }    
        for(int i=0;i<d;i++)
        {
            a[j]=arr[i];
            j++;
        }
        
    
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=a[i];
        }
    }
}
