import java.util.Scanner;
class PrimeSeries
{
	public static void main(String[] args)
	{
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. where you want to display the series");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("the number is prime"+i);
			}
			
		}
	}
}