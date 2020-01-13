import java.util.Scanner;
class PassingArray
{
	static void parray(int[] a)
	{	int sum =0;
		for(int i=0;i<a.length;i++)
		{	
			System.out.println(a[i]);
			sum = sum+a[i];
		}
		System.out.println("sum is "+sum);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		parray(arr);
	}
}