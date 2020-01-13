import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		int d,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int n = sc.nextInt();
		while(n !=0)
		{
			d = n%10;
			sum = sum*10+d;
			n = n/10;
		}
		System.out.println("the given number is "+sum);
	}
}