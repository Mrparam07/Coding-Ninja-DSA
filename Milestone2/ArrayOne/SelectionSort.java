
public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        
        for(int i=0;i<arr.length-1;i++)
        {
            int temp = 0;
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>=arr[j]){
                        
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
        }
