class Finally2
{
	public static void main(String[] args)
	{
		System.out.println("1");
		try
		{
			int i = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}