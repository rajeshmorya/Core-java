import java.util.Scanner;
class Trycatch1
{
	public static void main(String[] args)
	{
		int result=0,i=0,j=0;
		System.out.println("enter the i and j value");
		Scanner sc = new Scanner(System.in);
		try
		{
			i= sc.nextInt();
			j= sc.nextInt();
			//result = i/j;
		}
		catch(Exception e)
		{
			System.out.println("please give the other number than zero");
		}
		try
		{
			
			result = i/j;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
	//System.exit(0);
		finally
		{	System.exit(0);
			System.out.println("finally is executing");
			sc.close();
		}
		
	}
}