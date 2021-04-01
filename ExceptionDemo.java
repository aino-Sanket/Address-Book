import java.util.*;


public class ExceptionDemo {
	
	public  ExceptionDemo(int age)
	{
		try {
		if(age<18)
		{
			throw new ArithmeticException("Access Denied you are less than 18");
		}
		
		else
		{
			System.out.println("Volla!!!!  You are allowed to proceed");
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		ExceptionDemo obj=new ExceptionDemo(age);
	}
	

}
