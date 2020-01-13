import java.util.Scanner;
class Methods2
{
	static int palindrom(int n)
	{	int rev = 0,n2;
		while(n>0)
		{
			n2 = n%10;
			rev = rev*10+n2;
			n = n/10;
		}
		return rev;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		int n1 = palindrom(n);
		if(n1 == n)
		{
			System.out.println("the number is palindrome");
		}else
		{
			System.out.println("the number is not palindrome");
		}

		System.out.println(n1);	
	}
}