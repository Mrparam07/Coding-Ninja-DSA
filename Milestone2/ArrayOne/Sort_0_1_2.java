public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            c0++;
            else if(arr[i]==1)
            c1++;
            else
            c2++;
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        
        for (int i = c0; i < c1+c0; i++) {
            arr[i] = 1;
        }
        
        for (int i = c1+c0; i < c0+c1+c2; i++) {
            arr[i] = 2;
        }
    }

}
