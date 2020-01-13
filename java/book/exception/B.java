class B
{
	static void test() throws ClassNotFoundException
	{
		Class.forName("A.class");
 
	}
	public static void main(String[] args)
	{
		try
		{
			test();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("this is exception");
			System.out.println(e);
		}
		catch(VirtualMachineError e)
		{
			System.out.println("this is new exception");
		}
	}
}