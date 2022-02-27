package pkgfocus;

public class Student
{	
 int Rollumber;
 int Age;
 	
 	public void method1()
 	{
 		System.out.println("Welcome to all of you ");
 	}
 	public void method2()
 	{
 		System.out.println("Automation is very easy ");
 	}
 	public static void main(String[] args) 
 	{
	Student abc=new Student();
	abc.method1();
	abc.method2();
	abc.Rollumber=55;
	System.out.println(abc.Rollumber);
	abc.Age=99;
	System.out.println(abc.Age);
	}
	
}
