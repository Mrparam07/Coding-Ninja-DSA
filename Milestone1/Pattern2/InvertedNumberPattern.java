/*
Code : Inverted Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int i=1;
   int p=n;
   while(i<=n){

	   int j=n;
	   while(j>=i){
		   System.out.print(p);
		   j--;
	   }
	   System.out.println();
	   i++;
	   p--;
   }
		
	}

}
