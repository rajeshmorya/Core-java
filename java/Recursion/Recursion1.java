import java.util.Scanner;
class Recursion1
{
	static int pow(int n,int p)
	{ 
		if(p>0)
		{
			return n*pow(n,p-1);
		}else
		{
			return 1;
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("enter the power");
		int p = sc.nextInt();
		System.out.println(pow(n,p));
	}
}