import java.util.HashMap;

public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here

     HashMap<Integer, Integer> map = new HashMap<>();

      for(int i=0;i<arr.length;i++)
      {
        if(map.containsKey(arr[i]))
          {
            map.put(arr[i],map.get(arr[i])+1);
          }
        else
        map.put(arr[i], 1);
      }
      for(int i=0;i<arr.length;i++)
      {
        if(map.get(arr[i])==1)
        return arr[i];
      }
      return -1;
    }
}
