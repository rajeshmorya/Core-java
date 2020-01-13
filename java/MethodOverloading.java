import java.util.Scanner;
class MethodOverloading
{
	static void sum()
	{
		//System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int a = sc.nextInt();
		System.out.println("enten the second value");	
		int b = sc.nextInt();
		System.out.println("the value of a+b is"+(a+b));
	}
	static void sum(int a, int b)
	{
		System.out.println("the value is"+(a+b));
	}
	static void sum(int a, float b)
	{
		System.out.println("the value is"+(a+b));
	}
	public static void main(String[] args)
	{
		sum();
		sum(10,20);
		sum(30,2.5f);
	}
}