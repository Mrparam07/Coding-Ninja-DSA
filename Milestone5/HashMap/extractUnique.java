import java.util.HashMap;


public class Solution {

	public static String uniqueChar(String str){
		
		String s="";
		HashMap<Character, Boolean> map = new HashMap<>();
		for(int i =0; i<str.length();i++)
		{
			// if(map.containsKey(str.charAt(i)))
			// continue;
			// s+=str.charAt(i);
			// map.put(str.charAt(i), true);
				if(map.containsKey(str.charAt(i))==false)
				s+=str.charAt(i);
			
			    map.put(str.charAt(i), true);
		}
		return s;
	}
}
