import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		int d,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int n = sc.nextInt();
		int m =n;
		while(n!=0)
		{
			d = n%10;
			sum = (sum)+(d*d*d);
			n = n/10;
		}
		if(m == sum)
		System.out.println("armstrong number is "+sum);
		else
		System.out.println("not armstrong number "+sum);
	}
}