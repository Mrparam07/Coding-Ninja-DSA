public class printRecursion {

    public static void printSubSeq(String input, String soFar){
        if(input.length() == 0){
            System.out.println(soFar);
            return;
        }
        String smallInput = input.substring(1);
        printSubSeq(smallInput, soFar);
        printSubSeq(smallInput, soFar+input.charAt(0));
    }
    public static void main(String[] args) {
        printSubSeq("abc", "");
    }
}
