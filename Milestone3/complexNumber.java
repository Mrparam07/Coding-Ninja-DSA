/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	private int a,b;
	ComplexNumbers(int a,int b)
	{
			this.a=a;
			this.b=b;
	}
	public void plus(ComplexNumbers ob)
	{
		this.a=ob.a+this.a;
		this.b=ob.b+this.b;
	}
	public void multiply(ComplexNumbers ob)
	{
		 int temp=this.a;  
    this.a = (this.a*ob.a)-(this.b*ob.b);
        this.b =temp*ob.b+this.b*ob.a;
	}
	public void print()
	{
		System.out.println(a+" + i"+b);
	}
	
}
