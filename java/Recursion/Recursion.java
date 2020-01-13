import java.util.Scanner;
class Recursion
{
	static int fact(int n)
	{
		if(n>0)
		{
			return n*fact(n-1);
		}else
		{
			return 1;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}
}