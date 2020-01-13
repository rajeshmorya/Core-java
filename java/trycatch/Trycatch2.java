class Trycatch2
{
	public static void main(String[] args)
	{
		int i=2,j=0,k;
		try
		{
			k= i/j;
			System.out.println(k);
			try
			{
				int l=6,m=0,n;
				n = l/m;
				System.out.println("the value is "+n);
			}
			catch(ArithmeticException e)
			{
				System.out.println("new arithmetic exception");
			}
			catch(Exception e)
			{
				System.out.println("Arithmetic exception");	
			}
			finally
			{
				System.out.println("hello");
			}
		}
		catch(Exception e)
		{
			System.out.println("outer arithmetic exception");
		}
		finally
		{
			System.out.println(i);
			System.out.println(j);	
		}
	}	
}