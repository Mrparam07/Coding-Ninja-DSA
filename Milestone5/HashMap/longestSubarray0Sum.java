import java.util.HashMap;
import java.lang.Math;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		int i = -1;
		map.put(sum, i);
		int maxLen = 0;

		while(i<arr.length-1)
		{
			i++;
			sum+=arr[i];
			if(!map.containsKey(sum))
			map.put(sum, i);
			else
			{
				int len = i - map.get(sum);
				maxLen = Math.max(maxLen, len);
			}
			
		}
		return maxLen;
	}
}
