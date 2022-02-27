package pkgfocus;
// Assignment Day--6--1
public class AssignmentD61 
{	
	public void method1()
	{
		System.out.println("Parent default method ");
	}
	public void method2(int a)
	{
		System.out.println("Parent one parameterized method ");
	}
	public void method3(int a,int b)
	{
		System.out.println("Parent two parameterized method ");
	}
	public void method4(int a,int b,int c)
	{
		System.out.println("Parent three parameterized method ");
	}
	public void method5(int a,int b,int c,int d)
	{
		this.method4(2, 2, 2);
		this.method1();
		this.method2(2);
		this.method3(2, 2);
		System.out.println("Parent four parameterized method ");
	}
}
