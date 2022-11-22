/*
Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
*/
import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		// Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           
            int j =1;

            for (int i = n; i >= 1; i--) {

                for (int l = n; l >= 1; l--) {

                    if ( j == l ) {
                        System.out.print("*");
                        j++;
                    } else
                        System.out.print(l);

                }
                System.out.println();
            }
        }
	}
