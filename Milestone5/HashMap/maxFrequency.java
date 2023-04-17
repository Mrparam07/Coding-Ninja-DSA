import java.util.*;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		
	HashMap<Integer,Integer> map = new HashMap<>();

	for(int i =0;i<arr.length;i++)
	{
		if(map.containsKey(arr[i]))
		{
			map.put(arr[i],map.get(arr[i])+1);
		}
		else
		map.put(arr[i],1);
	}
	int max = 0;
	int result = 0;
	for(int i =0;i<arr.length;i++)
	{
		if(map.get(arr[i])>max)
		{
			max = map.get(arr[i]);
			result = arr[i];
		}
	}
return result;

    }
}

