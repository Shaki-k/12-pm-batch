package pkgfocus;
public class Arithmetic 
{
	public void multi(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("Multi result is "+c);
	}
	public int sum(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("Sum result is "+z);
		return z;
	}
	public int sub(int a1,int a2)
	{
		int a3;
		a3=a1-a2;
		System.out.println("Sub result is "+a3);
		return a3;
	}
	public int div(int p,int q)
	{
		int r;
		r=p/q;
		System.out.println("Div result is "+r);
		return r;
	}
	public static void main(String[] args)
	{
	Arithmetic obj=new Arithmetic();
	int divresult=obj.div(10, 2);
	int subresult=obj.sub(divresult, 2);
	int sumresult=obj.sum(subresult, 2);
	int subresult1=obj.sub(sumresult, 2);
	obj.multi(subresult1, 2);
	}
}
