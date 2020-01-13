import java.util.Scanner;
class Hello
{
	public static void main(String []args)
	{	int sum =0;int d;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n  = scan.nextInt();
		while(n != 0)
		{
			d = n%10;
			sum = sum+d;
			n = n/10;
		}
		System.out.println("sum of digites is "+sum);
	}
}