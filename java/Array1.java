import java.util.Scanner;
class Array1
{
	public static void main(String[] args)
	{
		int ar[];
		ar = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 5 array element");
		
		for(int i=0;i<5;i++)
		{
			int n1 = sc.nextInt();
			ar[i] = n1; 	
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.println("the no is "+ar[j]);
		}

	}
}