public class sumOfFraction {
    private int numerator;
    private int denominator;
    sumOfFraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public void gcd()
    {
        int g=1;
        int smaller=Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++)
        {
            if(numerator%i==0 && denominator%i==0)
                g=i;
        }
        numerator=numerator/g;
        denominator=denominator/g;
    }
    public void print()
    {
        gcd();
        System.out.println(numerator+"/"+denominator);
    }
    public void increement()
    {
        numerator=numerator+denominator;
        gcd();
        print();
    }
    public void add(sumOfFraction f2)
    {
        this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
        this.denominator=this.denominator* f2.denominator;
        gcd();
    }
}
class MainClass
{
    public static void main(String[] args)
    {
        sumOfFraction f1=new sumOfFraction(8,24);
        f1.print();
        sumOfFraction f2=new sumOfFraction(9,15);
        f2.print();
        f1.add(f2);
        f1.print();
    }
}
