import java.util.Scanner;
class PassingArrayElement
{
	static void evenodd(int n)
	{
		if(n%2 == 0)
		{
			System.out.println("no is even "+n);
		}else
		{
			System.out.println("no is odd "+n);
		}	
	}
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			evenodd(arr[i]);
		}		
	}
}