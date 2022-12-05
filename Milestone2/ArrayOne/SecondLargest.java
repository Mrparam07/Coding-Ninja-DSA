public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	
        int N = arr.length;
        if (N <= 1) {
            return Integer.MIN_VALUE;

        }
        int count=0;
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]==arr[i+1])
            count++;
        }
        if(count==N-1)
        return Integer.MIN_VALUE;

        int temp=arr[0];
        int flag= arr[0];
        
        

        for(int i=1;i<arr.length;i++)
        {
            if(temp<arr[i]){
                temp=arr[i];
                //arr[i]=Integer.MIN_VALUE;
            }

        }
        //METHOD 1
        for(int i=0;i<N;i++)
        {
            if(arr[i]==temp)
            continue;
            if(arr[i]>flag)
            flag=arr[i];
        }
        
      //METHOD 2
        // for (int i = 0; i < arr.length ; i++) {
        //     if (temp==arr[i]) {
        //          arr[i]=Integer.MIN_VALUE;
                
        //  }

        // }
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (flag<arr[i]) {
        //         flag = arr[i];
                
        //     }

        // }

        return flag;
    }

}
