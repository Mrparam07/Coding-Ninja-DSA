public class Solution {

    public static int[] arrange(int arr[],int n) {

        //int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n;
        }
        for (int i = 0; i < n / 2; i++) {
            arr[i] = 2 * i + 1;
            arr[n - 1 - i] = 2 * i + 2;
        }

        return arr;

    }

}
