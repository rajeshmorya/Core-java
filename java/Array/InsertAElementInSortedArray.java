import java.util.*;
class InsertAElementInSortedArray
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int []ar = new int[5];
		System.out.println("enter the array element");
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("enter the element you want to insert");
			int item = sc.nextInt();
		for(int i=ar.length-2;item<ar[i]&&i>=0;i--)
		{
			ar[i+1] = ar[i];		
			ar[i+1] = item;
		}
		System.out.println("the array are");		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}