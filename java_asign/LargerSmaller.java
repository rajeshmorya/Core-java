import java.util.Scanner;
class LargerSmaller
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int n = sc.nextInt();
		System.out.println("enter the second number");
		int n1 = sc.nextInt();
		if(n>n1)
		System.out.println("first number is greater"+n);
		if(n1>n)
		System.out.println("second number is greater"+n1);
		if(n1==n)
		System.out.printf("first number %d is equal to the second number %d",n,n1);
		
	}
}