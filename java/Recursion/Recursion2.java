import java.util.Scanner;
class Recursion2
{
	static int fab(int i)
	{
		if(i ==1 || i == 0)
		{
			return 1;
		}else
		{
			return fab(i-1)+fab(i-2);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(fab(i));
		}
	}
}