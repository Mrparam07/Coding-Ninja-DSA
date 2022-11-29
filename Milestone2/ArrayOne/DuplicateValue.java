
public class Solution{  

    public static int duplicateNumber(int[] arr){
		int n=arr.length;
    int count=0;
    for(int i=0;i<n;i++)
    {
      count =0;
      for(int j=0;j<n;j++){
        if(arr[i]==arr[j])
        count ++;
        
      }
      if(count==2){
        return arr[i];
      }
    }
   
    return 0;
    }
}
