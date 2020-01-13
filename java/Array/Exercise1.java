import java.util.Scanner;
class Exercise1
{
	public static void main(String[] args)
	{
		int sum =0;int mul = 1;
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				sum = sum+a[i];
			}
			else
			{
				mul = mul*a[i];
			}
		}
		System.out.println("the sum is"+sum);
		System.out.println("the multiplication is"+mul);
	}
}