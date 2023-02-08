public class Equi {
    public static int equi(int a[])
    {
        int ls,rs;
        for(int i=0;i<a.length;i++)
        {
            ls=0;
            rs=0;
            for(int j=0;j<i;j++)
            {
                ls+=a[j];
            }
            for(int k=i;k<a.length;k++)
            {
                rs+=a[k];
            }
            if(ls==rs) {
                return 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        int result=equi(arr);
        if(result==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
