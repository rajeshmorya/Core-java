import java.util.Scanner;
class Rightshifted
{
	public static void main(String[] args)
	{	
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter the array element");
		int []a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		 int b = a[a.length-1];
	
		for(int i=a.length-1;i>0;i--)
		{
			 a[i] = a[i-1];
			//System.out.println("the elements "+a[i]);
		}
		a[0] = b;

		for(int i=0;i<a.length;i++)
		{
			System.out.println("the number is"+a[i]);
		}
	}
}