/*
Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            int pr = num;
            for(int j=1;j<=n;j++)
            {
                System.out.print(pr);
                pr+=2;
                if(i+j==n+1)
                {
                    pr=1;
                }
            }
            num+=2;
            System.out.println();
        }
	}
}
