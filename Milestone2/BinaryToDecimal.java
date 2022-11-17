import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=0;
		int i=0;
		long sum=0;
		while(n>0){
			temp=n%10;
			sum=sum+(int)(Math.pow(2,i)*temp);
			n=n/10;
			i++;
		}
			System.out.println(sum);
	}
}
