
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n1 = arr1.length;
        int n2 = arr2.length;
        int num1 = 0;
        
        for(int i=0;i<n1;i++) {
            num1 = num1*10 + arr1[i];
        }

        int num2 = 0;
        for(int i=0;i<n2;i++) {
            num2 = num2*10 + arr2[i];
        }
        int sum = num1 + num2;
        int len;
        if(n1>n2)
            len = n1;
        else
            len = n2;

        for(int i=output.length-1;i>=0;i--)
        {
            output[i] = sum%10;
            sum/=10;
        }


    }

}
