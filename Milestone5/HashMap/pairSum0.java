import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for(int i=0; i<input.length;i++)
		{
			int temp = -input[i];

			if(map.containsKey(temp))
			count+=map.get(temp);
			
			if(map.containsKey(input[i])){
			map.put(input[i], map.get(input[i])+1);
			}
			else
			map.put(input[i], 1);
		}
		return count;
	}
}
