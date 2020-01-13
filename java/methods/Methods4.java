import java.util.Scanner;
class Methods4
{
	static boolean primeno(int n)
	{	boolean flag = true;
		for(int i=2;i<n-1;i++)
		{
		
			if(n%i == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=4;i<n;i++)
		{
			boolean n1 = primeno(i);
			if(n1 == true)
			{
				System.out.println(i);
			}
			
		}	
	}

}