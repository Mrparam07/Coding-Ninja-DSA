public class Solution{  

    public static int findUnique(int[] arr){
		int n=arr.length;
    int count=0;
    for(int i=0;i<n;i++)
    {
      count =0;
      for(int j=0;j<n;j++){
        if(arr[i]==arr[j])
        count ++;
        
      }
      if(count==1){
        return arr[i];
      }
    }
   
    return 0;
    }
}
