import java.util.Scanner;
class TwoDimensionArray
{
	public static void main(String[] args)
	{
		System.out.println("enter the two D array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][];
		System.out.println("enter arrays size");
		for(int i=0;i<a.length;i++)
		{
			a[i] = new int[sc.nextInt()];

		}
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		

	}
}