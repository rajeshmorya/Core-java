import java.util.Scanner;
class Exercise
{
	public static void main(String[] args)
	{
		int []a = new int[5];int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array element");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		int min =a[0],max = a[0];
		for(int i=0;i<5;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
			if(max<a[i])
			{
				max = a[i];
			}	
		}
		sum = max+min;
		System.out.println(sum);
	}
}