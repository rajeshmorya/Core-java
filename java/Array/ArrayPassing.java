import java.util.Scanner;
class ArrayPassing
{
	
	static int[] read()
	{
		System.out.println("enter the array");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	return arr;
	}
	static void write(int[] arr)
	{	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args)
{
	int a[] = read();
	write(a);
}
}