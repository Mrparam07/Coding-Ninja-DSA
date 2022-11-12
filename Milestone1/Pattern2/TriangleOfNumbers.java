/*
Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
     1 
    232
   34543
  4567654
 567898765
Sample Input 2:
4
Sample Output 2:
     1
    232
   34543
  4567654
*/

		import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int number=1;
		int i=1;
	
		while(i<=n){
			
			number=i;
			int space=n-i;
			while(space>0){
				System.out.print(' ');
				space--;
			}
			int j=1;
			while(j<=i){
				System.out.print(number);
				number++;
				j++;
			}
			number--;
			number--;
			int dec=i-1;
			while(dec>=1){
				System.out.print(number);
				number--;
				dec--;
			}
			System.out.println();
			i++;
		}
		
	}

}
