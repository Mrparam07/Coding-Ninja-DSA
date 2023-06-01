public class Solution {

	public static int getMin(int arr[], int N){
        
		int n = N;
        int dp[]= new int[n+1];
		for(int i=0;i<dp.length;i++)
		{
			dp[i] = 0;
		}
		int x=0;
    dp[0]=1;
    for(int i=1;i<n;i++) {
        if(arr[i]>arr[i-1]) {
            dp[i]+=dp[i-1]+1;
        }
        else {
            dp[i]=1;
    }
    }

    for(int i=n-2;i>=0;i--) {
        if(arr[i]>arr[i+1] && dp[i]<=dp[i+1]) {
            dp[i]=dp[i+1]+1;
        }
           }
     for(int i=0;i<n;i++) {
        x+=dp[i];
    }   
    return x;
        
    }
}
