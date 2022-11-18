import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int arr[] = new int[100];
            int i = 0;
           
                
                int n = sc.nextInt();
                if (n == 0) {
                    System.out.println(n);
                } else {

                    while (n > 0) {

                        arr[i] = n % 2;
                        n = n / 2;
                        i++;
                    }
                    for (int j = i - 1; j >= 0; j--) {
                        System.out.print(arr[j]);
                    }
                }
                System.out.println();
              
       
        
    }
}
