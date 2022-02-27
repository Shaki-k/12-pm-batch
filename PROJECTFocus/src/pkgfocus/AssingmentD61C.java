package pkgfocus;
//Assignment Day--6--1
public class AssingmentD61C extends AssignmentD61
{	
	public void method6()
	{
		System.out.println("Child default method ");
	}
	public void method7(int a)
	{
		this.method9(2, 2, 2);
		this.method8(2, 2);
		this.method6();
		this.method10(2, 2, 2, 2);
		System.out.println("Child one parameterized method ");
	}
	public void method8(int a,int b)
	{
		System.out.println("Child two parameterized method ");
	}
	public void method9(int a,int b,int c)
	{
		super.method5(2, 2,5,2);
		System.out.println("Child three parameterized method ");
	}
	public void method10(int a,int b,int c,int d)
	{
		System.out.println("Child four parameterized method ");
	}
public static void main(String[] args)
{
	AssingmentD61C obj=new AssingmentD61C();
	obj.method7(1);
}
}
