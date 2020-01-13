class Variable3
{
	static void M(short... s)
	{
		System.out.println("short argument");
	}
	static void M(int... z)
	{
		System.out.println("the int argurment");
	}
	static void M(long... l)
	{
		System.out.println("long variable");
	}
	public static void main(String... args)
	{
		byte b =20;
		M(b);
	}
}