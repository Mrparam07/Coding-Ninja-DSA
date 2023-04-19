import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int elem : arr)
		{
			map.put(elem, true);
		}
		for(int elem : arr)
		{
			if(map.containsKey(elem -1))
			map.put(elem, false);
		}

		int msp=0, ml=0;
		for(int elem : arr)
		{
			if(map.get(elem) == true){
				int tl = 1;
				int tsp = elem;
				while(map.containsKey(tsp+tl)){
					tl++;
				}
				if(tl > ml){
					ml = tl;
					msp = tsp;
				}
			}
		}
		ArrayList<Integer> output = new ArrayList<>();
		output.add(msp);
		output.add(msp+ml-1);

		return output; 
    }
}
