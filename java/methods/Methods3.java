import java.util.Scanner;
class Methods3
{
	static boolean prime(int n)
	{ boolean flag = true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i == 0)
			{
				flag = false;
			}
		}
		return flag;
	}
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean n1 = prime(n);
		if(n1 == true)
		{
			System.out.println("no. is prime");
		}else	
		{
			System.out.println("no. is not prime");
		}
	}
}
