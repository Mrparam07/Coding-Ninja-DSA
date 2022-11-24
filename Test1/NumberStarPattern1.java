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
/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=53332:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\CodingNinjaas NumberStarPattern
7
765432*
76543*1
7654*21
765*321
76*4321
7*54321
*654321

Process finished with exit code 0

*/
