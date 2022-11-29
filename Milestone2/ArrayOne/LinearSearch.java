
public class Solution {

    public static int linearSearch(int arr[], int x) {
		int a=0;
    int t=0;
    int N=arr.length;
    for(int i=0;i<N;i++){

      if(arr[i]==x){
          a=1;
          break;
      }
      t++;
      
    }
    if(a==1)
    return t;
    else
    return t=-1;
    }
}
