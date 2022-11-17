import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// int sum=(int)Math.sqrt(n);
		// 	System.out.println(sum);
		int a=0;
		if(n==1){
			System.out.print(n);
		}
		else{
		for(int i=1;i<=n/2;i++)
		{
			if((i*i)>n){
			a=i-1;
			break;
			}
			else if(i*i==n){
			a=i;
			break;
			}
		}
		System.out.print(a);
	}
}
}
