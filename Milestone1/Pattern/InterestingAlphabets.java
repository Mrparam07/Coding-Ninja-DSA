/*
Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char ch=(char)(n+64);
	int i=1;
	while(i<=n){
		int j=1;
		char c=(char)(ch-i+1);
		while(j<=i){
			
			System.out.print(c);
			c=(char)(c+1);
			
			j++;
		}
		i++;
		System.out.println();
	}
		
	}

}
