import java.util.Arrays;

public class RecursionSubsequence {
    public static String[] subseq(String input)
    {
        if(input.length() == 0)
        {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        String[] smallOutput = subseq(input.substring(1));
        String output[] = new String[smallOutput.length*2];

        for(int i=0;i<smallOutput.length;i++)
        {
            output[i] = smallOutput[i];
        }
        for(int i=0;i<smallOutput.length;i++)
        {
            output[smallOutput.length+i] = input.charAt(0)+smallOutput[i];
        }
        return output;
    }
    public static void main(String[] args) {
        String str = "abcd";
        String[] s = subseq(str);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        //System.out.println(Arrays.toString(s));
    }
}
