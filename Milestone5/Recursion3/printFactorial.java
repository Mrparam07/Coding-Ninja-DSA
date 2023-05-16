public class printFactorial {

    public static void print(int n, int ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        ans = n * ans;
        print(n-1,ans);
    }
    public static void main(String[] args) {
        print(5, 1);
    }
}
