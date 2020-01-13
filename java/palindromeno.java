import java.util.Scanner;
class palindromeno
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			int sum=0,j=i,d;
			while(j!=0)
			{
				d = j%10;
				sum = sum*10+d;
				j = j/10;
			}
		if(i == sum)
		System.out.println("palindrome no is "+sum);
		}
	}
}