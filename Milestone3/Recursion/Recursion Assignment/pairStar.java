
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		if(s.length()==1)
		return s;

		String str=addStars(s.substring(1));
		if(s.charAt(0)==str.charAt(0))
		return s.charAt(0)+"*"+str;

		return s.charAt(0)+str;
	}
}
