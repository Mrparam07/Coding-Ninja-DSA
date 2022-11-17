import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		//	int a=i;
			if((3*i+2)%4!=0){
				System.out.print(3*i+2+" ");
				
			}
			else
			n++;
		}

	}
}
