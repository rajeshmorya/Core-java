class c
{
	int test(int i)	
	{
		try
		{
			i = 10/i;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}
	public static void main(String[] args)
	{	
		c C = new c();
		System.out.println(C.test(10));
		
	}
}