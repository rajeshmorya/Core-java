import java.util.Scanner;
class Array2
{
	public static void main(String[] args)
	{
		String names[];
		names = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the names");
		for(int i=0;i<5;i++)
		{
			names[i] = sc.next();
			
		}

		for(int j=0;j<5;j++)
		{
			System.out.println("the values is "+names[j]);
		}

	}
}