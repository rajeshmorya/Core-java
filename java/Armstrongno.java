import java.util.Scanner;
class Armstrongno
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the number");
		int n = sc.nextInt();
		int sum =0,d;
		for(int i=1;i<=n;i++)
		{
			int j= i;sum =0;
			while(j!=0)
			{
				d = j%10;
				sum = sum+d*d*d;
				j = j/10;
			}
		if(i == sum)
		System.out.println("the armstrong no. is "+sum);

		}
	}
	
}