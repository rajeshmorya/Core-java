class D
{
	int test(int i)
	{	int j=20;
	
		try
		{
			i = 10/i;
			return j;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return i;
	}
	public static void main(String[] args)
	{
		D d = new D();
		System.out.println(d.test(2));
	}
}