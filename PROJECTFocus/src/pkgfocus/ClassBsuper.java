package pkgfocus;

// Day 6 Second use of super keyword Second use

public class ClassBsuper extends ClassAsuper
{
	public void method3()
	{
		this.method4();	// internal call
		System.out.println("Child class method ");
	}
	public void method4()
	{
		System.out.println("Child class2 method ");
		super.method1();	// external call
		super.method2();	// external call
		super.deepak=55;	//calling variable of parent class inside child class
	}
	public static void main(String[] args)
	{
	ClassBsuper obj=new ClassBsuper();
	obj.method3();
	}
}
