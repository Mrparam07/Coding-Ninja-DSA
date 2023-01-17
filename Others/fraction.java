public class Fraction {

        private int numerator;
        private int denominator;
        Fraction(int numerator,int denominator)
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
            int i=numerator+denominator;
            System.out.println(i+"/"+denominator);
        }
    }
class Main
{
    public static void main(String[] args) {
        Fraction ob=new Fraction(8,24);
        ob.print();
        ob.increement();
    }
}


