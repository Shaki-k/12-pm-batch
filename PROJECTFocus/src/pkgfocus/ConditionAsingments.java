package pkgfocus;
import java.util.Scanner;
// Assignment---7---day 7--- factorial of a number
public class ConditionAsingments 
{
	public void factorial() 
	{
		int number=7;
		for(int i=1;i<7;i++)
		{
			number=number*i;
				
		}
		System.out.println("factorial 7 is "+number);
	}
	public static void main(String[] args) 
	{
		ConditionAsingments obj=new ConditionAsingments();
		obj.factorial();	
	}
}
