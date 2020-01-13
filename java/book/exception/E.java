class E
{
	int test(int i)
	{
		try
		{
			i=10/i;
			return i;
		}
		catch(Exception e)
		{
			int j=20;
			System.out.println(e);
			return j;
		}
	}
	public static void main(String[] args)
	{	
		E e = new E();
		System.out.println(e.test(2));
	}
}