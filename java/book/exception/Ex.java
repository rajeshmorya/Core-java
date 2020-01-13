import java.util.Scanner;
class Ageboundexception extends RuntimeException
{
	public Ageboundexception(String s)
	{
		super(s);
	}
}
class A1
{
	static void Age(int age)
	{
		if(age<18)
		{
			throw new Ageboundexception("sfds");
		}
		else
		{
			System.out.println("curect age="+age);
		}
	}
}
public class Ex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		//try
		//{
			A1.Age(age);
				
		//}
		//catch(Ageboundexception e)
		//{
		//	System.out.println("age should be greater than 18");
		//}
		//A1.printStackTrace();
		System.out.println("done");
	}
}