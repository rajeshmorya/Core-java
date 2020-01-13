import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{	
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int n = sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				flag = false;
			}
			
		}
		if(flag == true)
		{
			System.out.println("no. is prime");
		}else
		{		
			System.out.println("no is not prime");
		}

	}
}