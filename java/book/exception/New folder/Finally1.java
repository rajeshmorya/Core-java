class Finally1
{
	static void test()
	{
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			try
			{
				int i = Integer.parseInt("abc");
			}
			catch(NumberFormatException e1)
			{
				System.out.println(e1);
			}
			finally
			{
				System.out.println("inner_finally");
			}
		}
		finally
		{
			System.out.println("outer_finally");
		}
	}
	public static void main(String[] args)
	{
		test();
	}
}