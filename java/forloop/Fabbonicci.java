import java.util.Scanner;
class Fabbonicci
{
	public static void main(String[] args)
	{
		int a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();	
		for(int i=0;i<=n;i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.println(" "+c);
		}
		
	}
}