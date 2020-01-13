import java.util.Scanner;
class ForLoop4
{
	public static void main(String[] args)
	{	
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of series");
		int n = sc.nextInt();
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		for(int i=0;i<=n;i++)
		{	
			sum = sum+Math.pow(x,y+i);
		}		
		System.out.println(sum);
	}
}