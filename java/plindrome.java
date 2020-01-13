import java.util.Scanner;
class plindrome
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int m = n,s=0,d;
		while(n!=0)
		{
			d = n%10;
			s = s*10+d;
			n = n/10;
		}
	if(s == m)
	System.out.println("palindrome number is"+s);
	else
	System.out.println("not palindrome number");
		
	}
}