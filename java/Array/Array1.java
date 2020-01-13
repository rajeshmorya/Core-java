import java.util.Scanner;
class Array1
{
	public static void main(String[] args)
	{	
		int x[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		x = new int[sc.nextInt()];
		System.out.println("enter the number");
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();	
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}