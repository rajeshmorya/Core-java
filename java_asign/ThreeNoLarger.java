import java.util.Scanner;
class ThreeNoLarger
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int n = sc.nextInt();
		System.out.println("enter the second number");
		int n1 = sc.nextInt();
		System.out.println("enter the third number");
		int n2 = sc.nextInt();
		if(n>n1&&n>n2)
		System.out.println("first number is greater");
		if(n1>n&&n1>n2)
		System.out.println("second number is greater");
		if(n2>n&&n2>n1)
		System.out.println("third number is greater");

	}
}