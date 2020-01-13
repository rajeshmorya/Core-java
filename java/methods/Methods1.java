import java.util.Scanner;
class Methods1
{
	static int sum(int n)
	{  int sum1 =0,n1;
		while(n>0)
		{
			n1 = n%10;
			sum1 = sum1+n1;
			n = n/10;
		}
		return sum1;
	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int s = sum(n);
	System.out.println("the sum is"+sum(n));
	}

}