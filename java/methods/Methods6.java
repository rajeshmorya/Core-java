import java.util.Scanner;
class Methods6
{
	static long DecimalBinary(int num)
	{	long rem, a=1, bin=0;
		while(num>0)
		{
			rem=num%2; 
			bin=bin+rem*a;
			num/=2; 
			a*=10;
		}
		return bin;
	}
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long n1 = DecimalBinary(n);
		System.out.println(n1);
		
	}
}