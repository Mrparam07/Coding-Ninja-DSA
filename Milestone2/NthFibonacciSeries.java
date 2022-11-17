import java.util.Scanner;
public class Solution {

    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
    System.out.println(fib(n)); 
    } 
        
		
	}
//method 2 using array

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n;i++){

            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n-1]);
    }
}

