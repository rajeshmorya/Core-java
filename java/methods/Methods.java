import java.util.Scanner;
class Methods
{
	static void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("the sum is"+(a+b));
	}
	public static void main(String[] args)
	{
		add();
	}
}